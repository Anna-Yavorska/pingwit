package org.example.hw_5.taskWithAsterisk;

public class LongestSequence {
    public static void main(String[] args) {
        int[] number = new int[]{0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};

         int lengthOneOfSequence = 1;
         int repetitionsQuantity = 1;
         int longestSequence = 0;
         int oneOfStart = 0;
         int anotherStart = 0;
         int startOfSequence = 0;
         int lengthAnotherSequence = 0;

        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == number[i + 1]) {
                repetitionsQuantity = repetitionsQuantity + 1;
                if (repetitionsQuantity > lengthOneOfSequence) {
                    lengthOneOfSequence = repetitionsQuantity;
                    oneOfStart = i;
                } else {
                    lengthAnotherSequence = lengthOneOfSequence;
                    anotherStart = oneOfStart;
                }
                if (lengthOneOfSequence > lengthAnotherSequence) {
                    longestSequence = lengthOneOfSequence;
                    startOfSequence = oneOfStart - (longestSequence - 3);
                } else {
                    longestSequence = lengthAnotherSequence;
                    startOfSequence = anotherStart - (lengthOneOfSequence - 3);
                }
            } else {
                repetitionsQuantity = 1;
            }
        }
        System.out.println("Самая длинная последовательность начинается с  " + startOfSequence + " элемента");
        System.out.println("Количество элементов в самой длинной последовательности: " + longestSequence);
    }
    }
    
    /*
    public static void main(String[] args) {
        int maxIndex = 0;
        int maxCounter = 0;
        int currentIndex = 0;
        int currentCounter = 1;
        int[] sequence = new int[] {1, 1, 1, 0, 0, 1, 1,1,1};
        for (int i = 1; i < sequence.length; i++) {
            int current = sequence[i];
            int previous = sequence[i - 1];
            if (current == previous) {
                currentCounter++;
                if (currentCounter == 2) {
                    currentIndex = i - 1;
                }
            } else {
                if (maxCounter < currentCounter) {
                    maxCounter = currentCounter;
                    maxIndex = currentIndex;
                }
                currentCounter = 1;
                currentIndex = i;
            }
        }
        if (maxCounter < currentCounter) {
            maxCounter = currentCounter;
            maxIndex = currentIndex;
        }
        System.out.println("Количество самой длинной последовательности: " + maxCounter + ", начиная с " + maxIndex + " элемента"); }
    */

