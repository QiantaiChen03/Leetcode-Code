package com.leetcode;

import java.util.Stack;

public class Q20 {
    // Valid Parentheses
    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        System.out.println(s.length());

        //O(n)
        for (char c: s.toCharArray()) {
            System.out.println(c);
            if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();


    }

    public static void main (String[] args) {
        Q20 validParentheses = new Q20();
        boolean b = validParentheses.isValid("{[]}");
        System.out.println(b);
    }
}
