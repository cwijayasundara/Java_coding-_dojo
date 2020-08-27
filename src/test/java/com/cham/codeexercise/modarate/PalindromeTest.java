package com.cham.codeexercise.modarate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();
    @Test
    public void testPalindrome(){
        assertEquals(palindrome.isPalindrome("abcba"), true);
        assertEquals(palindrome.isPalindrome("malayalam"), true);
        assertNotEquals(palindrome.isPalindrome("chaminda"), true);
    }
}