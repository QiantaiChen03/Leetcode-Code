package com.leetcode.LinkedList;

public class Q206 {
    // Reverse Linked List
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
    //Iterative
    public ListNode reverseList (ListNode head) {
        if (head == null) {
            return head;
        } else {
            ListNode curr = head;
            ListNode prev = null;
            while (curr != null) {
                ListNode nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
            }
            return prev;
        }
    }
    //Recursive
    public ListNode reverseList2 (ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
             ListNode list = reverseList2(head.next);
             head.next.next = head;
             head.next = null;
             return list;
        }
    }
}
