package org.example.hw_11.task_4;

import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        String empty = "";
        String space = " ";
        String notEmpty = "something";

        String[] strings = new String[]{empty, space, notEmpty};

        for (String string : strings) {
            System.out.println("is empty: " + StringUtils.isEmpty(string));
            System.out.println("is blank: " + StringUtils.isBlank(string));
        }

        String palindrome = "tod dot";
        String reverse = StringUtils.reverse(palindrome);

        if (palindrome.equals(reverse)) {
            System.out.printf("Строка '%s' является палиндромом", palindrome);
        } else {
            System.out.printf("Строка '%s' не является палиндромом", palindrome);
        }
    }
}
