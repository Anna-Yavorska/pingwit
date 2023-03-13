package org.example.hw_13.task_1;

// все хорошо
public class Application {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 7, 9, 21, 14, 15};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(100 / (numbers[i] - 9));
            } catch (ArithmeticException e) {
                System.out.printf("При обработке элемента №%d возникла ошибка: " + e.getMessage(), i + 1);
                System.out.println();
            }
        }
    }
}
