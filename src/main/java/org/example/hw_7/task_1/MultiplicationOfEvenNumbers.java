package org.example.hw_7.task_1;

import java.util.Arrays;

public class MultiplicationOfEvenNumbers {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{4, 6, 10, 7, 1, 0, 2, 2};
        int[] resultArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] % 2 != 0) {
                resultArray[i] = sourceArray[i];
            } else if (sourceArray[i] % 2 == 0) {   // тут можно было бы даже не писать if(...),
                // достаточно было бы просто else и все отработало бы хорошо. исправлять не нужно
                resultArray[i] = (sourceArray[i] * 5);
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
