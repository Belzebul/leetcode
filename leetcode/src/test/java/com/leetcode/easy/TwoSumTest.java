package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TwoSumTest {
    @ParameterizedTest
    @MethodSource
    void testTwoSum(int[] input1, int input2, int[] expectedAnswer) {
        TwoSum twoSum = new TwoSum();

        int[] answer = twoSum.twoSum(input1, input2);
        assertArrayEquals(answer, expectedAnswer);
    }

    private static Stream<Arguments> testTwoSum() {
        return Stream.of(
                Arguments.of(new int[] { 2, 7, 11, 15 }, 9, new int[] { 0, 1 }),
                Arguments.of(new int[] { 3, 2, 4 }, 6, new int[] { 1, 2 }),
                Arguments.of(new int[] { 3, 3 }, 6, new int[] { 0, 1 }));
    }

}
