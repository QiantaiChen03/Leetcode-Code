package com.leetcode.LinkedList;

public class Q82 {
    //Remove Duplicates From Sorted List II
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = new ListNode(0,head);
        ListNode predecessor = temp;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                predecessor.next = head.next;
            } else {
                predecessor = predecessor.next;
            }
            head = head.next;
        }
        return temp.next;
    }
}
