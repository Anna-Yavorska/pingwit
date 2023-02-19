package org.example.hw_5.taskWithAsterisk;

public class LongestSequence {
    public static void main(String[] args) {
        Finding finding = new Finding();

        int[] number = new int[]{0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};

        finding.find(number);
    }
}
