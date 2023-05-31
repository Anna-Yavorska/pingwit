package org.example.hw_32.task_1;

import java.util.concurrent.atomic.AtomicInteger;

public class GravelHeap {
    private final AtomicInteger weight = new AtomicInteger(0);

    public AtomicInteger getWeight() {
        return weight;
    }

    public void increase(int amount) {
        weight.addAndGet(amount);
    }
}
