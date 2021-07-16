package com.leetcode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Q17 {
    //Letter Combinations of a Phone Number

    private char[][] letters = {{'0'},{'1'},{'a', 'b', 'c'},{'d', 'e', 'f'},{'g', 'h', 'i'},{'j', 'k', 'l'},{'m', 'n', 'o'},{'p', 'q', 'r', 's'},{'t', 'u', 'v'},{'w', 'x', 'y', 'z'}};
    public List<String> letterCombinations(String digits) {
        if(digits == null) {
            return null;
        }
        List<String> result = new ArrayList<String>();
        if (digits.equals("")) {
            return result;
        }
        char[] levelResult  = new char[digits.length()];
        combine(result, levelResult, digits, 0);

        return result;
    }

    public void combine (List<String> result, char[] levelResult, String digits, int count) {
        if (count == digits.length()) {
            result.add(new String(levelResult));
        } else {
            for (char c: letters[digits.charAt(count)- '0']){
                levelResult[count] = c;
                combine(result, levelResult, digits, count + 1);
            }
        }
    }

    public static void main (String[] args) {
        Q17 test = new Q17();
        List<String> result = test.letterCombinations("23");
        System.out.print(result);
    }
}
