package org.example.hw_21.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdvancedLoginApp {
    public static final String EXIT = "exit";
    public static final String SKIP = "skip";

    public static void main(String[] args) {
        PasswordService passwordService = new PasswordService();

        Map<String, Password> namesWithPasswords = new HashMap<>();

        namesWithPasswords.put("Pavel", new Password(Password.ATTEMPTS_QUANTITY, "pass1"));
        namesWithPasswords.put("Anna", new Password(Password.ATTEMPTS_QUANTITY, "pass2"));
        namesWithPasswords.put("Illia", new Password(Password.ATTEMPTS_QUANTITY, "pass3"));

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
                passwordService.checkAttemptsQuantity(password);
                if (!passwordService.isBlock()) {
                    System.out.println("Please enter your password..");
                    String enteredPassword = scanner.nextLine();

                    if (enteredPassword.equals(passwordFromDB)) {
                        System.out.println("Hello, " + username);
                        password.resetAttemptsQuantity(password);
                    } else {
                        System.out.println("Password incorrect! Try again!");
                        password.changeAttemptsQuantity(password);
                    }
                }
            } else {
                System.out.println("Not found: " + username);
                System.out.println("If you want to register, enter your name. If you want to skip - enter 'skip'");
                String newName = scanner.nextLine();
                if (!namesWithPasswords.containsKey(newName)) {
                    if (!newName.equalsIgnoreCase(SKIP)) {
                        System.out.println("Enter your new password:");
                        String newPassword = scanner.nextLine();
                        namesWithPasswords.put(newName, new Password(Password.ATTEMPTS_QUANTITY, newPassword));
                        System.out.println("Hello, " + newName + ", you are registered!");
                    }
                } else {
                    System.out.println("Account with such name is already exists");
                }
            }
        }
    }
}
