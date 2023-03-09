package org.example.hw_12.task_3;

public class PalindromeService {
    public boolean isPalindrome(String string) {
        if (string.length() <= 1) {
            return true;
        }
        isPalindrome(string.substring(1, string.length() - 1));

        char firstSymbol = string.charAt(0);
        char lastSymbol = string.charAt(string.length() - 1);

        return firstSymbol == lastSymbol;
    }
}
