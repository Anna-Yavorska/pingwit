package org.example.hw_3.task_3;

public class Calculation {
    public static void main(String[] args) {
        int sum = 0;

        // может быть ты здесь решала какую-то другую задачу, у нас была
        //Task 3
        //Вычислить: 1+2+4+8+...+256   - мы ведь одно и то же задание решаем?

        for (int i = 0; i <= 8; i++) {
            sum += 1 << i;
        }
        System.out.println(sum);
    }
}
