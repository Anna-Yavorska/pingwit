package org.example.hw_15.task_3;

public class DivisionMultiplicationNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[]{66, 77, 90, 3, 15, 33, 45, 0, -20};
        int multiplicationResult = 1;

        for (int element : numbers) {
            System.out.printf("%d поделить на 3 = %d", element, element / 3);
            System.out.println();
            multiplicationResult *= element;
        }
        System.out.println(multiplicationResult);
    }
}
