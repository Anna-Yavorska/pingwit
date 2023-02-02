package org.example.hw_3.task_9;

public class Rhombus {
    public static void main(String[] args) {
        int diagonalMiddle = 4;
        String space = " ";

        for (int i = 0; i <= diagonalMiddle; i++) {
            for (int j = diagonalMiddle; j > i; j--) {
                System.out.print(space);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = diagonalMiddle; i >= 0; i--) {
            for (int j = diagonalMiddle; j >= i; j--) {
                System.out.print(space);
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
