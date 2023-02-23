package org.example.hw_9.task_1;

public class StringLength {
    public int[] collectStringLengths(String[] strings) {
        int[] stringLengths = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            stringLengths[i] = strings[i].length();
        }
        return stringLengths;
    }
}
