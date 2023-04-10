package org.example.hw_21.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdvancedLoginApp {

    private static final int ATTEMPTS_QUANTITY = 3;
    private static final int UNIT = 1;
    private static final int ZERO = 0;
    public static final String EXIT = "exit";
    public static final String SKIP = "skip";

    public static void main(String[] args) {

        Map<String, Password> namesWithPasswords = new HashMap<>();

        // реализация рабочая, но есть куда улучшить. Я бы пердложил вынести логику количесвта попыток и проверок в отдельный сервис

        namesWithPasswords.put("Pavel", new Password(ATTEMPTS_QUANTITY, "pass1"));
        namesWithPasswords.put("Anna", new Password(ATTEMPTS_QUANTITY, "pass2"));
        namesWithPasswords.put("Illia", new Password(ATTEMPTS_QUANTITY, "pass3"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase(EXIT)) {
                break;
            }
            if (namesWithPasswords.containsKey(username)) {

                Password password = namesWithPasswords.get(username);
                String passwordFromDB = password.getPassword();
                if (password.getAttemptsQuantity() == UNIT) {
                    System.out.println("You have last chance. If you enter the wrong password, account will be blocked!");
                }
                if (password.getAttemptsQuantity() == ZERO) {
                    System.out.println(username + ", is blocked");
                    continue;
                }
                System.out.println("Please enter your password..");
                String enteredPassword = scanner.nextLine();

                if (enteredPassword.equals(passwordFromDB)) {
                    System.out.println("Hello, " + username);
                } else {
                    System.out.println("Password incorrect! Bye!");
                    password.changeAttemptsQuantity(password);
                }
            } else {
                System.out.println("Not found: " + username);
                System.out.println("If you want to register, enter your name. If you want to skip - enter 'skip'");
                String newName = scanner.nextLine();
                if (!newName.equalsIgnoreCase(SKIP)) {
                    System.out.println("Enter your new password");
                    String newPassword = scanner.nextLine();
                    namesWithPasswords.put(newName, new Password(ATTEMPTS_QUANTITY, newPassword));
                    System.out.println("Hello, " + newName + ", you are registered!");
                }
            }
        }
    }
}
