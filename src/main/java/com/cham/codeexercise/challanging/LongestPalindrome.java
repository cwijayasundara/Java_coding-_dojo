package com.cham.codeexercise.challanging;

public class LongestPalindrome {

    public String findLongestPalindrome(String word) {
        String longestPalindrome = "";
        for (int i = 0; i < word.length(); i++) {
            String current = findLongestPalindromeInternal(word.substring(i, word.length()));
            if (longestPalindrome.length() < current.length()) {
                longestPalindrome = current;
            }
        }
        return longestPalindrome;
    }

    private String findLongestPalindromeInternal(String word) {
        String longestPalindrome;
        int index = word.length();
        while (index > 0 && !isPalindrome(word.substring(0, index))) {
            index--;
        }
        longestPalindrome = word.substring(0, index);
        return longestPalindrome;
    }

    private boolean isPalindrome(String word){
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
