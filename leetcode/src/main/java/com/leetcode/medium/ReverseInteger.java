package com.leetcode.medium;

public class ReverseInteger {
    public int reverse(int x) {
        int revNum = 0;
        boolean positive = x > 0;
        int secureNum = 0;
        x = positive ? -1 * x : x;

        while (x != 0 && secureNum < 9) {
            revNum = revNum * 10 + (x % 10);
            x /= 10;
            secureNum++;
        }

        if (x != 0) {
            if (revNum > Integer.MIN_VALUE / 10) {
                if (positive) {
                    return x >= -7 ? -1 * (revNum * 10 + (x % 10)) : 0;
                } else {
                    return x >= -8 ? revNum * 10 + (x % 10) : 0;
                }
            } else {
                return 0;
            }
        }

        return positive ? -1 * revNum : revNum;
    }
}
