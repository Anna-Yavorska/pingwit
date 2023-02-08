package org.example.hw_5.task_6;

import java.util.Arrays;

public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] number = new int[]{1, 7, 8, 9, 6, 5, 2, 4, 3};
        int quantityEvenNumber = 0;

        for (int elem : number) {
            if (elem % 2 == 0) {
                quantityEvenNumber = quantityEvenNumber + 1;
            }
        }

        int[] evenNumber = new int[quantityEvenNumber];
        int indexOfEvenArray = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                evenNumber[indexOfEvenArray] = number[i];
                indexOfEvenArray = indexOfEvenArray + 1;
            }
        }

        System.out.println(Arrays.toString(evenNumber));
    }
}
