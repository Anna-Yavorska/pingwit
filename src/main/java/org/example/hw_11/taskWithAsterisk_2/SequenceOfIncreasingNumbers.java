package org.example.hw_11.taskWithAsterisk_2;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfIncreasingNumbers {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>(List.of(2, 4));
        Integer lastNumber = 6;

        // я не очень понял зачем ты заполняешь одинаковыми элементами. Я думаю добавлять концовку лучше после второго цикла + тогда будет меньше итераций
        while (sequence.size() < lastNumber) {
            sequence.add(lastNumber);
        }

        for (int i = sequence.size() - 1; i >= 0; i--) {
            boolean suitableNumber = sequence.get(i).equals(lastNumber);
            if (!suitableNumber) {
                sequence.set(i, lastNumber);
            }
            lastNumber--;
        }
        System.out.println(sequence);
    }
}
