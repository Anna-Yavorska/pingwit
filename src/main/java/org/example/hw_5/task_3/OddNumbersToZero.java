package org.example.hw_5.task_3;

import java.util.Arrays;

public class OddNumbersToZero {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 8, 5, 7, 9, 6, 2, 3};

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] = 0;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
