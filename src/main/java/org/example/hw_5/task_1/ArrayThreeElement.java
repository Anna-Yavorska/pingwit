package org.example.hw_5.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayThreeElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число для первого элемента массива:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите целое число для второго элемента массива:");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите целое число для третьего элемента массива:");
        int thirdNumber = scanner.nextInt();
        int[] number = new int[]{firstNumber, secondNumber, thirdNumber};
        Arrays.sort(number);

        int sum = 0;
        for (int elem : number) {
            sum += elem;
        }
        System.out.println("Наименьшее число: " + number[0]);
        System.out.println("Наибольшее число: " + number[number.length - 1]);
        System.out.println("Сумма: " + sum);
    }
}
