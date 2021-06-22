package com.leetcode.LinkedList;

import java.util.LinkedList;

public class Q21 {
    //Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode result = new ListNode(0);
        ListNode pred = result;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pred.next = l1;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                pred.next = l2;
                l2 = l2.next;
            }
            pred = pred.next;
        }
        if (l1 == null) {
            pred.next = l2;
        } else if (l2 == null) {
            pred.next = l1;
        }
        return result.next;
    }
}
