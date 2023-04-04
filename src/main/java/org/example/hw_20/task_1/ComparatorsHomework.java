package org.example.hw_20.task_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorsHomework {
    public static void main(String[] args) {
        List<AccountInfo> accountInfos = new ArrayList<>(List.of(
                new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11))));

        Comparator<AccountInfo> nameSurnameComparator = Comparator.comparing(AccountInfo::getName)
                .thenComparing(AccountInfo::getSurname);

        accountInfos.sort(nameSurnameComparator);
        for (AccountInfo accountInfo : accountInfos) {
            System.out.println(accountInfo);
        }
        System.out.println("=================");

        Comparator<AccountInfo> dateOfBirthComparator = Comparator.comparing(AccountInfo::getDateOfBirth).reversed();

        accountInfos.sort(dateOfBirthComparator);
        for (AccountInfo accountInfo : accountInfos) {
            System.out.println(accountInfo);
        }
        System.out.println("=================");

        Comparator<AccountInfo> nameSurnameDateOfBirthComparator = Comparator.comparing(AccountInfo::getName)
                .thenComparing(AccountInfo::getSurname)
                .thenComparing(AccountInfo::getDateOfBirth);

        accountInfos.sort(nameSurnameDateOfBirthComparator);
        for (AccountInfo accountInfo : accountInfos) {
            System.out.println(accountInfo);
        }
    }
}
