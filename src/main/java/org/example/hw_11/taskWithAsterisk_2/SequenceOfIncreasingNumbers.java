package org.example.hw_11.taskWithAsterisk_2;

import java.util.ArrayList;
import java.util.List;

// Очень хорошо.
public class SequenceOfIncreasingNumbers {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(List.of(1, 3, 6));
        Integer firstNumber = 1;

        for (int i = 0; i < sequence.size(); i++) {
            boolean suitableNumber = sequence.get(i).equals(firstNumber);

            if (!suitableNumber) {
                sequence.add(i, firstNumber);
            }
            firstNumber++;
        }
        System.out.println(sequence);
    }
}
