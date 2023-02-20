package org.example.hw_5.taskWithAsterisk;

public class Finding {
    // для таких целей поля класса не стоит использовать
    private int lengthOneOfSequence = 1;
    private int repetitionsQuantity = 1;
    private int longestSequence = 0;
    private int oneOfStart = 0;
    private int anotherStart = 0;
    private int startOfSequence = 0;
    private int lengthAnotherSequence = 0;

    public void find(int[] number) { //когда наззываешь метод find(), то я ожидаю, что он будет что-нибудь возвращать, void не подойдет

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
