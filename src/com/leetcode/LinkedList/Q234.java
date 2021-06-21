package com.leetcode.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q234 {
    //Palindrome Linked List
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode (int val) {
            this.val = val;
        }
        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        int len = length (head);
        int mid = len / 2;
        int count = 0;

        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            if (count < mid) {
                stack.push(curr.val);
                count++;
            } else if (length(head) % 2 == 1 && count == mid) {
                curr = curr.next;
            }
            else if (stack.pop() != curr.val){
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    public int length (ListNode head) {
        List<Integer> vals = new ArrayList<>();

        // Convert LinkedList into ArrayList.
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int len = vals.size();

        return len;
    }

    public boolean palindrome (ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        while (head != null) {
            if (stack.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
