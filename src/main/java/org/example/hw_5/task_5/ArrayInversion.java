package org.example.hw_5.task_5;

import java.util.Arrays;

// можно было чтуточку проще решить) Но твое решение работает, а это самое главное, поэтому зачтено
public class ArrayInversion {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4};
        int inversionIndex = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {
            int movingNumber = array[i];
            array[i] = array[inversionIndex];
            array[inversionIndex] = movingNumber;
            inversionIndex--;
        }
        System.out.println(Arrays.toString(array));
    }
}
