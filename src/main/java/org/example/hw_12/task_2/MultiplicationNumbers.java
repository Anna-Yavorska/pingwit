package org.example.hw_12.task_2;

public class MultiplicationNumbers {
    private static final int STEP = 2;

    public int multiplyNumbers(int number) {
        int result = 1;
        for (int i = number; i > 0; i = i - STEP) {
            result *= i;
        }
        return result;
    }

    public int multiplyNumbersRecursive(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * multiplyNumbersRecursive(number - STEP);
    }
}
