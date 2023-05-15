package org.example.hw_29.task_1;


public class GreetingService {
    public String greet(String name) throws IllegalArgumentException {
        String greeting = "Приветсвую тебя, ";
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("имя не может быть пустой строкой!");
        }
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("имя не может содержать цифры!");
            }
        }
        return greeting + name;
    }
}
