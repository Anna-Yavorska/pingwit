package org.example.hw_8.task_2;

import java.util.Arrays;

public class PalindromeService {
    public boolean isPalindrome(String string) {
        String alignment = string.toUpperCase();
        char[] stringToChar = alignment.toCharArray();
        int arrayLength = stringToChar.length;
        char[] reverseStringToChar = new char[arrayLength];

        for (int i = 0; i < stringToChar.length; i++) {
            reverseStringToChar[arrayLength - 1] = stringToChar[i];
            arrayLength--;
        }
        return Arrays.equals(reverseStringToChar, stringToChar);
    }
}
