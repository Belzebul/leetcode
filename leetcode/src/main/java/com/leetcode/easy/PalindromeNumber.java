package com.leetcode.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int magnitude = (int) (Math.floor(Math.log10(x)));
        int count = 0;
        while (magnitude > count) {
            int numA = (int) ((x % Math.pow(10, count + 1)) / Math.pow(10, count));
            int numB = (int) ((x % Math.pow(10, magnitude + 1)) / Math.pow(10, magnitude));
            if (numA != numB)
                return false;

            magnitude--;
            count++;
        }

        return true;
    }
}
