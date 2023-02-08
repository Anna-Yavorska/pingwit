package org.example.hw_5.task_4;

//Все хорошо
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 10;
        int[][] multiplicationTable = new int[tableSize + 1][tableSize + 1];
        System.out.println("Таблица умножения 10*10");

        for (int i = 1; i < multiplicationTable.length; i++) {
            int[] multiplicationResult = multiplicationTable[i];
            for (int j = 1; j < multiplicationTable.length; j++) {
                multiplicationResult[j] = i * j;
                System.out.print(multiplicationResult[j] + " ");
            }
            System.out.println();
        }
    }
}
