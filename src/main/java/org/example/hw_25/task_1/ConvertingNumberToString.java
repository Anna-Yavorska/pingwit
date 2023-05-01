package org.example.hw_25.task_1;

import java.util.function.Function;

public class ConvertingNumberToString {
    public static void main(String[] args) {
        Function<Integer, String> addWord = number -> {
            String quantity = number.toString();
            if (quantity.endsWith("11") || quantity.endsWith("12") || quantity.endsWith("13") || quantity.endsWith("14") || quantity.endsWith("5") || quantity.endsWith("6") || quantity.endsWith("7") || quantity.endsWith("8") || quantity.endsWith("9") || quantity.endsWith("0")) {
                return quantity + " рублей";
            } else if (quantity.endsWith("2") || quantity.endsWith("3") || quantity.endsWith("4")) {
                return quantity + "рубля";
            }
            return quantity + " рубль";
        };

        String apply = addWord.apply(31);
        System.out.println(apply);
    }
}
