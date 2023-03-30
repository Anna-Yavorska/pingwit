package org.example.hw_18.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovingEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int quantityElements = 100;
        for (int i = 1; i <= quantityElements; i++) {
            numbers.add(0, i);
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
