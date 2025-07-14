package com.leetcode.medium;

public class IntToRoman {
    private static final String[] scale = { "I", "V", "X", "L", "C", "D", "M" };

    public String intToRoman(int num) {
        int count = 0;
        int remainer = 0;

        StringBuilder roman = new StringBuilder();
        while (num != 0) {
            remainer = num % 10;
            switch (remainer) {
                case 1, 2, 3:
                    roman.insert(0, scale[count].repeat(remainer));
                    break;
                case 4:
                    roman.insert(0, scale[count] + scale[count + 1]);
                    break;
                case 5, 6, 7, 8:
                    roman.insert(0, scale[count + 1] + scale[count].repeat(remainer - 5));
                    break;
                case 9:
                    roman.insert(0, scale[count] + scale[count + 2]);
                    break;
                default:
                    break;
            }
            num /= 10;
            count += 2;
        }
        return roman.toString();
    }
}
