package org.example.hw_3.task_8;

public class Hundred {
    public static void main(String[] args) {
        int hundred = 100;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= hundred; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            // как вариант можно было вычислять общую сумму так totalSum +=i;
        }
        int totalSum = evenSum + oddSum;

        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(totalSum);
    }
}
