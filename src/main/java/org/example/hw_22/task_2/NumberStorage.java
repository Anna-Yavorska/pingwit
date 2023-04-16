package org.example.hw_22.task_2;

import java.util.Arrays;

public class NumberStorage<T extends Number> {

    private final T[] numbers;

    public NumberStorage(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "NumberStorage{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
