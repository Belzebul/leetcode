package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PalindromeNumberTest {

    @ParameterizedTest
    @MethodSource
    void testPalindromeNumber(int input1, boolean expectedAnswer) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean answer = palindromeNumber.isPalindrome(input1);

        assertEquals(answer, expectedAnswer);
    }

    private static Stream<Arguments> testPalindromeNumber() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false));
    }
}
