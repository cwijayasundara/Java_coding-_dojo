package com.cham.codeexercise.modarate;
/*
A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
Write a method that detects if a string is a palindrome.
Tip: Use word.charAt(i) to get the character at position i.
 */
public class Palindrome {

    public boolean isPalindrome(String word) {
        int firstIndex = 0;
        int lastIndex = word.length() - 1;
        while (lastIndex > firstIndex) {
            if (word.charAt(firstIndex) != word.charAt(lastIndex)) {
                return false;
            }
            ++firstIndex;
            --lastIndex;
        }
        return true;
    }
}
