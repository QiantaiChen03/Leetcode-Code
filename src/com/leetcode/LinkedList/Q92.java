package com.leetcode.LinkedList;

public class Q92 {
    //Reverse Linked List II
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null) {
            return head;
        }
        ListNode temp = new ListNode(0, head);
        ListNode pred = temp;
        for (int i = 0; i < left-1; i++) {
            //Ignore the node which doesn't need to reverse
            //System.out.print(head.val + " ");
            pred = pred.next;
        }
        //System.out.println();

        ListNode start = pred.next;
        ListNode startNext = start.next;
        for (int i = 0; i < right - left; i++) {
            start.next = startNext.next;
            startNext.next = pred.next;
            pred.next = startNext;
            startNext = start.next;
            //System.out.print(temp.next.val + " ");
        }
        return temp.next;
    }


}
