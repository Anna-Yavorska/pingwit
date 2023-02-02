package org.example.hw_3.task_7;

public class OddNumbersSum {
    public static void main(String[] args) {
        int hundred = 100;
        int oddSum = 0;
        for (int i = 1; i < hundred; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println(oddSum);
    }
}
