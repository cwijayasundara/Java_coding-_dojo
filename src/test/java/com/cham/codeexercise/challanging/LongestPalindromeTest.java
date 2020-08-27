package com.cham.codeexercise.challanging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeTest {

    private final LongestPalindrome longestPalindrome = new LongestPalindrome();

    private final String palindrome = "malayalam Repaper";

    @Test
    public void shouldTestLongestPalindrome(){
        System.out.println(palindrome.substring(0,8));
        assertEquals(longestPalindrome.findLongestPalindrome(palindrome),"malayalam");
    }
}