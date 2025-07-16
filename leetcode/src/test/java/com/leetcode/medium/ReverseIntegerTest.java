package com.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseIntegerTest {

    @ParameterizedTest
    @MethodSource
    void testReverse(int input, int expectedOutput) {
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(reverseInteger.reverse(input), expectedOutput);
    }

    private static Stream<Arguments> testReverse() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21));
    }
}
