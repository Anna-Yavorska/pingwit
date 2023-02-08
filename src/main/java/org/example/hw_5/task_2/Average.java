package org.example.hw_5.task_2;

// Все хорошо
public class Average {
    public static void main(String[] args) {
        int[] number = new int[]{97, 38, 14, 69, 8, 15, 24, 76, 23};
        double average;
        double sum = 0.0;

        for (int elem : number) {
            sum += elem;
        }

        average = sum / number.length;
        System.out.println(average);
    }
}
