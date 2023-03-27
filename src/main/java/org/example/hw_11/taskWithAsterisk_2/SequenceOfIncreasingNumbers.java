package org.example.hw_11.taskWithAsterisk_2;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfIncreasingNumbers {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(List.of(2, 4));
        feelMiddle(sequence, 1);
        addElementsToTheEnd(sequence, 6);
        System.out.println(sequence);
    }

    private static void feelMiddle(List<Integer> list, Integer firstNumber) {
        if (list.get(0) < firstNumber) {
            System.out.println("Failed to fill the middle");
            return;
        }
        if (list.get(0) >= firstNumber) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(firstNumber)) {
                    list.add(i, firstNumber);
                }
                firstNumber++;
            }
        }
    }

    private static void addElementsToTheEnd(List<Integer> list, int quantityElements) {
        if (list.size() > quantityElements) {
            System.out.println("This method cannot reduce the quantity of elements");
            return;
        }
        while (list.size() < quantityElements) {
            Integer number = list.get(list.size() - 1);
            list.add(++number);
        }
    }
}
