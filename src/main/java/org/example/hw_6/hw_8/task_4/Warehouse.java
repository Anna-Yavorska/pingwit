package org.example.hw_6.hw_8.task_4;

import java.util.Arrays;

public class Warehouse {
    private final int[] numbers;

    public Warehouse(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getArray() {
        return numbers.clone();
    }

    public int next(Warehouse warehouse, int number) {
        int[] array = warehouse.getArray();
        if (number == (array.length - 1)) {
            return array[0];
        }
        return array[number + 1];
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
