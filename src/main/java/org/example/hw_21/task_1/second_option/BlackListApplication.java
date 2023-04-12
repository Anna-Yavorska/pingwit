package org.example.hw_21.task_1.second_option;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlackListApplication {

    public static final String EXIT = "exit";
    public static final String SKIP = "skip";

    public static void main(String[] args) {
        BlackListService blackListService = new BlackListService();
        Map<String, String> namesWithPasswords = new HashMap<>();

        namesWithPasswords.put("Pavel", "pass1");
        namesWithPasswords.put("Anna", "pass2");
        namesWithPasswords.put("Illia", "pass3");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase(EXIT)) {
                break;
            }
            if (blackListService.isBanned(username)) {
                System.out.println(username + ", nothing can be changed. You are banned!");
                continue;
            }
            if (namesWithPasswords.containsKey(username)) {
                System.out.println("Please enter your password..");
                String password = scanner.nextLine();
                String passwordFromDB = namesWithPasswords.get(username);

                if (password.equals(passwordFromDB)) {
                    System.out.println("Hello, " + username);
                    blackListService.resetFailedLoginCount(username);
                } else {
                    System.out.println("Password incorrect! Try again!");
                    blackListService.increaseFailedLoginCounter(username);
                }

            } else {
                System.out.println("Not found: " + username);
                System.out.println("If you want to register, enter your name. If you want to skip - enter 'skip'");
                String newName = scanner.nextLine();
                if (!(namesWithPasswords.containsKey(newName))) {
                    if (!newName.equalsIgnoreCase(SKIP)) {
                        System.out.println("Enter your new password");
                        String newPassword = scanner.nextLine();
                        namesWithPasswords.put(newName, newPassword);
                        System.out.println("Hello, " + newName + " you are registered!");
                    }
                } else {
                    System.out.println("Account with such name is already exists");
                }
            }
        }
    }
}
