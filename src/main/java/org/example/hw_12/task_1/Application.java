package org.example.hw_12.task_1;

public class Application {
    public static void main(String[] args) {
        SumCalculation sumCalculation = new SumCalculation();

        int result = sumCalculation.calculateSum(5);
        System.out.println("Результат цикла:" + result);

        int recursiveResult = sumCalculation.calculateSumRecursive(5);
        System.out.println("Результат рекурсии:" + recursiveResult);

        if (result == recursiveResult) {
            System.out.println("Есть надежда на то, что решение верное");
        } else {
            System.out.println("Где-то есть ошибка");
        }
    }
}
