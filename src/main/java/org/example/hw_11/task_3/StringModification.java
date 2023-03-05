package org.example.hw_11.task_3;

public class StringModification {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Считаем от 1 до 100: ");
        for (int i = 1; i <= 100; i++) {
            builder.append(i + " ");
        }
        System.out.println(builder);
    }
}
