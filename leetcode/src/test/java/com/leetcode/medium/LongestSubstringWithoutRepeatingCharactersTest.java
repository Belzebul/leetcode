package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @MethodSource
    void testLengthOfLongestSubstring(String input, int expected) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        int output = l.lengthOfLongestSubstring(input);
        assertEquals(output, expected);
    }

    private static Stream<Arguments> testLengthOfLongestSubstring() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3));
    }
}
