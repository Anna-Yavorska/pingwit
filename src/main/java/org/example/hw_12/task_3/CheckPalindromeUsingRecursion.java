package org.example.hw_12.task_3;

public class CheckPalindromeUsingRecursion {
    public static void main(String[] args) {
        PalindromeService palindrome = new PalindromeService();

        String word = "tod dot";
        boolean result = palindrome.isPalindrome(word);
        System.out.println(result);
    }
}
