package com.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testCase1() {
        TwoSum twoSum = new TwoSum();

        int[] answer = twoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        assertArrayEquals(answer, new int[] { 0, 1 });
    }

    @Test
    void testCase2() {
        TwoSum twoSum = new TwoSum();

        int[] answer = twoSum.twoSum(new int[] { 3, 2, 4 }, 6);
        assertArrayEquals(answer, new int[] { 1, 2 });
    }

    @Test
    void testCase3() {
        TwoSum twoSum = new TwoSum();

        int[] answer = twoSum.twoSum(new int[] { 3, 3 }, 6);
        assertArrayEquals(answer, new int[] { 0, 1 });
    }
}
