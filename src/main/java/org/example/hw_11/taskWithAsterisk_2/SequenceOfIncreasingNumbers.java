package org.example.hw_11.taskWithAsterisk_2;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfIncreasingNumbers {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(List.of(4));
        startSequenceFrom(sequence, 1);
        increaseQuantityElements(sequence, 6);
        System.out.println(sequence);
    }

    private static void startSequenceFrom(List<Integer> list, Integer firstNumber) {
        for (int i = 0; i < list.size(); i++) {
            boolean equals = list.get(i).equals(firstNumber);
            if (!equals) {
                list.add(i, firstNumber);
            }
            firstNumber++;
        }
    }

    private static void increaseQuantityElements(List<Integer> list, int quantityElements) {
        while (list.size() < quantityElements) {
            Integer number = list.get(list.size() - 1);
            list.add(++number);
        }
        if (list.size() > quantityElements) {
            System.out.println("This method cannot reduce the quantity of elements");
        }
    }
}