package org.example.hw_18.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// все отлично
public class LoginVerification {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Vlad", "Olga", "Timur", "Liudmila", "Konstantin", "Elena"));
        System.out.println("Good evening! Enter your name, please:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean canEnter = names.contains(name);
        System.out.println(canEnter ? "You can enter" : "You can't enter");
    }
}
