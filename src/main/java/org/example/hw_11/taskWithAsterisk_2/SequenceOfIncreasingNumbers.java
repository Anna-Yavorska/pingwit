package org.example.hw_11.taskWithAsterisk_2;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfIncreasingNumbers {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(List.of(4));
        checkEachNumber(sequence);
        List<Integer> sequenceLength = checkListLength(sequence);
        System.out.println(sequenceLength);
    }

    private static void checkEachNumber(List<Integer> list) {
        Integer firstNumber = 1;
        for (int i = 0; i < list.size(); i++) {
            boolean equals = list.get(i).equals(firstNumber);
            if (!equals) {
                list.add(i, firstNumber);
            }
            firstNumber++;
        }
    }

    private static List<Integer> checkListLength(List<Integer> list) {
        int lastNumber = 6;
        while (list.size() < lastNumber) {
            Integer number = list.get(list.size() - 1);
            list.add(++number);
        }
        return list;
    }
}