package org.example.hw_3.task_4;

public class Multiplier {
    public static void main(String[] args) {
        int firstMultiplier = 5;
        int secondMultiplier = 11;
        int result = 0;

        for (int i = 1; i <= secondMultiplier; i ++) {
            result+=firstMultiplier;
            System.out.println(result);
        }
    }
}
