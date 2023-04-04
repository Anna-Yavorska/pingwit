package org.example.hw_20.task_2;

import org.example.hw_20.task_1.AccountInfo;

import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpHomework {
    private static final Pattern NAME_SURNAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("\\d+");
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");

    public static void main(String[] args) {
        List<AccountInfo> accountInfos = List.of(
                new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)));

        for (AccountInfo accountInfo : accountInfos) {
            String name = accountInfo.getName();
            String surname = accountInfo.getSurname();
            String phone = accountInfo.getPhone();
            String email = accountInfo.getEmail();

            Matcher nameMatcher = NAME_SURNAME_PATTERN.matcher(name);

            Matcher surnameMatcher = NAME_SURNAME_PATTERN.matcher(surname);

            Matcher phoneMatcher = PHONE_NUMBER_PATTERN.matcher(phone);

            Matcher emailMatcher = EMAIL_PATTERN.matcher(email);

            if (nameMatcher.matches() && surnameMatcher.matches() && phoneMatcher.matches() && emailMatcher.matches()) {
                System.out.println("Аккаунт валиден: " + accountInfo);
            } else {
                System.out.print("Аккаунт не валиден: ");
                if (!nameMatcher.matches()) {
                    System.out.println(name);
                }
                if (!surnameMatcher.matches()) {
                    System.out.println(surname);
                }
                if (!phoneMatcher.matches()) {
                    System.out.println(phone);
                }
                if (!emailMatcher.matches()) {
                    System.out.println(email);
                }
            }
        }
    }
}
