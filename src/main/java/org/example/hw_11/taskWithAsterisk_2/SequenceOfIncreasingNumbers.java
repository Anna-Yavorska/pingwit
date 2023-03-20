package org.example.hw_11.taskWithAsterisk_2;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfIncreasingNumbers {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(List.of(4));
        startSequenceFrom(sequence, 5);
        increaseQuantityElements(sequence, 6);
        System.out.println(sequence);
    }

    private static void startSequenceFrom(List<Integer> list, Integer firstNumber) { // startSequenceFrom -> feelMiddle
        if (list.get(0) > firstNumber) {
            for (int i = 0; i < list.size(); i++) {
                boolean equals = list.get(i).equals(firstNumber);// если уже пишешь в одну строку, то можно переместить внутрь лока if
                if (!equals) {
                    list.add(i, firstNumber);
                }
                firstNumber++;
            }
        } else {
            System.out.println("The sequence has such number");
        }
    }

    private static void increaseQuantityElements(List<Integer> list, int quantityElements) { // increaseQuantityElements -> addElementstoTheEnd
        while (list.size() < quantityElements) {
            Integer number = list.get(list.size() - 1);
            list.add(++number);
        }
        if (list.size() > quantityElements) { // такую проверку необходимо ставить в начале и я бы добавил return в конце данного if
            System.out.println("This method cannot reduce the quantity of elements");
        }
    }
}
