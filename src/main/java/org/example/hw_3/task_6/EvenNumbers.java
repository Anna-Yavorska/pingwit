package org.example.hw_3.task_6;

public class EvenNumbers {
    public static void main(String[] args) {
        int hundred = 100;
        for (int i = 1; i <= hundred; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
