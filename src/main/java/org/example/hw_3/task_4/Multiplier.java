package org.example.hw_3.task_4;

public class Multiplier {
    public static void main(String[] args) {

        // Task 4
        //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
        // здесь бы я ожидал увидеть сначала int a = 5, int b = 10, а потом в цикле прибавить a b раз

        int firstMultiplier = 10;
        int MultiplicationResult = 60;
        for (int i = 0; i <= MultiplicationResult; i += firstMultiplier) {
            System.out.println(i);
        }
    }
}
