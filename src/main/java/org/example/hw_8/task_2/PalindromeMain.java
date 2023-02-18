package org.example.hw_8.task_2;

public class PalindromeMain {
    public static void main(String[] args) {
        PalindromeService palindrome = new PalindromeService();

        boolean result = palindrome.isPalindrome("Anna");
        System.out.println(result);
    }
}
