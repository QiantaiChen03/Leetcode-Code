package com.leetcode.LinkedList;

public class Q1474 {
    //Delete N Nodes after M Nodes of a Linked List
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
    public ListNode deleteNodes (ListNode head, int m, int n) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            for (int i = 0; i < m && curr != null; i++) {
                prev = curr;
                curr = curr.next;
            }
            for (int i = 0; i < n && curr != null; i++) {
                curr = curr.next;
            }
            prev.next = curr;
        }
        return head;
    }
}
