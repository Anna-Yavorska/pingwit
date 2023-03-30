package org.example.hw_18.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemovalFromTheMiddle {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        String favoriteWord = "Мама";
        int quantity = 100_000;
        for (int i = 0; i < quantity; i++) {
            arrayList.add(favoriteWord);
            linkedList.add(favoriteWord);
        }
        long startRemovingArray = System.currentTimeMillis();
        while (arrayList.size() != 0) {
            arrayList.remove(arrayList.size() / 2);
        }
        long finishRemovingArray = System.currentTimeMillis();
        long arrayListTime = finishRemovingArray - startRemovingArray;

        long startRemovingLinked = System.currentTimeMillis();
        while (linkedList.size() != 0) {
            linkedList.remove(linkedList.size() / 2);
        }
        long finishRemovingLinked = System.currentTimeMillis();
        long linkedListTime = finishRemovingLinked - startRemovingLinked;
        System.out.println("ArrayList: " + arrayListTime);
        System.out.println("LinkedList: " + linkedListTime);
    }
}
