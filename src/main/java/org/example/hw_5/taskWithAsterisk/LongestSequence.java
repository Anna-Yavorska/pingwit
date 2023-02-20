package org.example.hw_5.taskWithAsterisk;

public class LongestSequence {
    public static void main(String[] args) {
        Finding finding = new Finding();

        int[] number = new int[]{0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};

        finding.find(number);
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

        System.out.println("Количество самой длинной последовательности: " + maxCounter + ", начиная с " + maxIndex + " элемента");
    }
    */
}
