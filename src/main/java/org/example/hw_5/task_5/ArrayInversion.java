package org.example.hw_5.task_5;

import java.util.Arrays;

public class ArrayInversion {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4};
        int[] invertedArray = new int[array.length];
        int index = 0;

        for (int i = array.length - 1; i > 0; i--) {
            invertedArray[index] = array[i];
            index = index + 1;
        }

        System.out.print(Arrays.toString(array));
        System.out.print(" -> " + Arrays.toString(invertedArray));
    }
}
