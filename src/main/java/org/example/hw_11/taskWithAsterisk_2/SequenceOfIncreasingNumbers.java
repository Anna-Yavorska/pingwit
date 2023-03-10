package org.example.hw_11.taskWithAsterisk_2;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfIncreasingNumbers {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(List.of(2, 4));
        Integer firstNumber = 1;
        int lastNumber = 6;

        for (int i = 0; i < sequence.size(); i++) {
            boolean equals = sequence.get(i).equals(firstNumber);
            if (!equals) {
                sequence.add(i, firstNumber);
            }
            firstNumber++;
        }
        while (sequence.size() < lastNumber) {
            sequence.add(firstNumber);
            firstNumber++;
        }
        System.out.println(sequence);
    }
}