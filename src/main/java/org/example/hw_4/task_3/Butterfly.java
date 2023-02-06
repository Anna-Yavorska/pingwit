package org.example.hw_4.task_3;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое парное число до 18 включительно");
        int butterflySize = scanner.nextInt();

        if (butterflySize < 20 && butterflySize % 2 == 0) {
            String emptySymbol = " ";
            int middleSize = butterflySize / 2;
            int leftBorder = 1;
            int rightBorder = butterflySize;
            for (int i = 0; i < middleSize; i++) {
                int printingIndex = 1;
                for (int j = 1; j < butterflySize + 1; j++) {
                    if (j <= leftBorder) {
                        System.out.print(printingIndex);
                    } else {
                        if (j < middleSize) {
                            System.out.print(emptySymbol);
                        } else {
                            if (j < rightBorder) {
                                System.out.print(emptySymbol);
                            } else {
                                System.out.print(printingIndex);
                            }
                        }
                    }
                    if (j < middleSize) {
                        printingIndex++;
                    }
                    if (j > middleSize) {
                        printingIndex--;
                    }
                }
                System.out.println();
                leftBorder++;
                rightBorder--;
            }
            for (int i = 0; i < butterflySize - 1; i++) {
                int printingIndex = 1;
                middleSize--;
                for (int j = 1; j < butterflySize + 1; j++) {

                    if (j <= middleSize) {
                        System.out.print(printingIndex);
                    } else {
                        if (j > leftBorder) {
                            System.out.print(printingIndex);
                            printingIndex--;
                        } else {
                            System.out.print(emptySymbol);
                        }
                    }
                    if (j < butterflySize) {
                        printingIndex++;
                    }
                    if (j > middleSize - 1) {
                        printingIndex--;
                    }

                }
                System.out.println();
                leftBorder++;
                if (i == butterflySize / 2 - 2) {
                    return;
                }
            }
        } else {
            System.out.println("Вы ввели неверное число");
        }
    }
}