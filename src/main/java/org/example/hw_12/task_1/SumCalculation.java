package org.example.hw_12.task_1;

public class SumCalculation {
    public int calculateSum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public int calculateSumRecursive(int number) {
        if (number == 0) {
            return 0;
        }
        return number + calculateSumRecursive(number - 1);
    }
}
