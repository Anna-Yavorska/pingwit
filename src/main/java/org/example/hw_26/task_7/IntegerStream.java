package org.example.hw_26.task_7;

import java.util.List;
import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String[] args) {
        List<Integer> integers = IntStream.range(50, 150)
                .filter(number -> number % 7 == 0)
                .boxed()
                .toList();
        System.out.println(integers);
    }
}
