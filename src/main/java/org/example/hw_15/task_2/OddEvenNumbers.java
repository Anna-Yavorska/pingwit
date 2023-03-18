package org.example.hw_15.task_2;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 18, 9, 7, 15, 33, 32, 0, -20};
        int evenSum = 0;

        for (int element : numbers) {
            if (element % 2 == 0) {
                evenSum += element;
            } else {
                System.out.println(element);
            }
        }
        System.out.printf("Сумма всех четных чисел: %d", evenSum);
    }
}
