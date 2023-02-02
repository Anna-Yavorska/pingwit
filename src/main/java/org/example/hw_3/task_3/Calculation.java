package org.example.hw_3.task_3;

public class Calculation {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 8; i++) {
            sum += 1 << i;
        }
        System.out.println(sum);
    }
}
