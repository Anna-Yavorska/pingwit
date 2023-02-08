package org.example.hw_5.task_7;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] number = new int[]{5, 8, 9, 2, 0, 4, 6};
        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < number.length; i++) {

                if (number[i - 1] > number[i]) {

                    int movingNumber = number[i];
                    number[i] = number[i - 1];
                    number[i - 1] = movingNumber;
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
