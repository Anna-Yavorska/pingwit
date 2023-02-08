package org.example.hw_5.taskWithAsterisk;

public class LongestSequence {
    public static void main(String[] args) {
        int maxZero = 0;
        int maxOne = 0;
        int countZero = 0;
        int countOne = 0;
        int startOne = 0;
        int startZero = 0;

        int[] number = new int[]{0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};

        for (int i = 0; i < number.length; i++) {

            if (number[i] == 1) {
                countOne = countOne + 1;
            } else {
                if (countOne > maxOne) {
                    maxOne = countOne;
                    startOne = (i + 1) - maxOne;
                }
                countOne = 0;
            }

            if (number[i] == 0) {
                countZero = countZero + 1;
            } else {
                if (countZero > maxZero) {
                    maxZero = countZero;
                    startZero = (i + 1) - maxZero;
                }
                countZero = 0;
            }
        }

        if (maxOne > maxZero) {
            System.out.println("Количество самой длинной последовательности: " + maxOne + ", начиная с " + startOne + " элемента");
        } else {
            System.out.println("Количество самой длинной последовательности: " + maxZero + ", начиная с " + startZero + " элемента");
        }

    }
}
