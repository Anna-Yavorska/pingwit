package org.example.hw_22.task_2;

import java.util.Random;

// Все хорошо, замечаний нет
public class Application {
    private static final int ARRAYS_LENGTH = 10;

    public static void main(String[] args) {
        Random random = new Random();

        Integer[] integers = new Integer[ARRAYS_LENGTH];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt();
        }
        NumberStorage<Integer> intNumbers = new NumberStorage<>(integers);

        Long[] longs = new Long[ARRAYS_LENGTH];
        for (int i = 0; i < longs.length; i++) {
            longs[i] = random.nextLong();
        }
        NumberStorage<Long> longNumbers = new NumberStorage<>(longs);

        Double[] doubles = new Double[ARRAYS_LENGTH];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = random.nextDouble();
        }
        NumberStorage<Double> doubleNumbers = new NumberStorage<>(doubles);

        System.out.println(intNumbers);
        System.out.println(longNumbers);
        System.out.println(doubleNumbers);
    }
}
