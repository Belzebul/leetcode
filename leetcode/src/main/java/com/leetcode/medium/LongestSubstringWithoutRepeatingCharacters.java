package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int acc = 0;
        int index = 0;
        List<Character> uniqueChars = new ArrayList<>(s.length());
        char[] input = s.toCharArray();
        while (index < s.length()) {

            if (uniqueChars.contains(input[index])) {
                int indexWithUniqueChar = uniqueChars.indexOf(input[index]) + 1;
                uniqueChars = uniqueChars.subList(indexWithUniqueChar, uniqueChars.size());
            }

            uniqueChars.add(input[index]);
            acc = Math.max(acc, uniqueChars.size());
            index++;
        }

        return acc;
    }
}
/*
 * aabaab!bb
 * 012345678
 * 
 * a
 * 0123
 * 
 * ABCDECFGHI
 * 0123456789
 * 
 * ABCDE
 * 01234
 */