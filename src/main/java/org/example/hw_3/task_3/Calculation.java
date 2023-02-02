package org.example.hw_3.task_3;

public class Calculation {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 256;
        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i *= 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
