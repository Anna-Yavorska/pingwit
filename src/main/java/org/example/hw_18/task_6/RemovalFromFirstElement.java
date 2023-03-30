package org.example.hw_18.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemovalFromFirstElement {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int quantity = 100_000;
        for (int i = 0; i < quantity; i++) {
            arrayList.add(quantity);
            linkedList.add(quantity);
        }
        long startRemovingArray = System.currentTimeMillis();
        while (arrayList.size() != 0) {
            arrayList.remove(0);
        }
        long finishRemovingArray = System.currentTimeMillis();
        long arrayListTime = finishRemovingArray - startRemovingArray;

        long startRemovingLinked = System.currentTimeMillis();
        while (linkedList.size() != 0) {
            linkedList.remove(0);
        }
        long finishRemovingLinked = System.currentTimeMillis();
        long linkedListTime = finishRemovingLinked - startRemovingLinked;
        System.out.println("ArrayList: " + arrayListTime);
        System.out.println("LinkedList: " + linkedListTime);
    }
}
