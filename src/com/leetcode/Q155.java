package com.leetcode;

import java.util.Stack;

public class Q155 {
    //Minimum Stack
    // Create a array based stack
    Stack<int[]> stack = new Stack<>();

    public Q155() {

    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[] {val,val});
            return;
        }
        int lastItem = stack.peek()[1];
        stack.push(new int[] {val, Math.min(val,lastItem)});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

    public static void main (String[] args) {
        Q155 minStack = new Q155();
        minStack.push(-2);
        minStack.push(-0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();

    }
}
