package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class IntToRomanTest {

    @ParameterizedTest
    @MethodSource
    void testIntToRoman(int input, String expectedOutput) {
        IntToRoman intToRoman = new IntToRoman();
        assertEquals(intToRoman.intToRoman(input), expectedOutput);
    }

    private static Stream<Arguments> testIntToRoman() {
        return Stream.of(
                Arguments.of(3749, "MMMDCCXLIX"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV"));
    }
}
