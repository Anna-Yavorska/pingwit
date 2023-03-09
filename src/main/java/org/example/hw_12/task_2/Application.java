package org.example.hw_12.task_2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MultiplicationNumbers multiplication = new MultiplicationNumbers();

        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int resultCycle = multiplication.multiplyNumbers(number);
        System.out.println(resultCycle);

        int recursiveResult = multiplication.multiplyNumbersRecursive(number);
        System.out.println(recursiveResult);

        if (resultCycle == recursiveResult) {
            System.out.println("Есть надежда на то, что решение верное");
        } else {
            System.out.println("Где-то есть ошибка");
        }
    }
}
