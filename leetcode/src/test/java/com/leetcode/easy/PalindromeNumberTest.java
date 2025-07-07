package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    @Test
    void testCase1() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean answer = palindromeNumber.isPalindrome(121);

        assertEquals(answer, true);
    }
}
