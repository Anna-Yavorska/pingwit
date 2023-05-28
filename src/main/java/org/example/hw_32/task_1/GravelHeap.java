package org.example.hw_32.task_1;

public class GravelHeap {
    private int weight = 0;

    public int getWeight() {
        return weight;
    }

    public void increase(int amount) {
        weight = weight + amount;
    }
}
