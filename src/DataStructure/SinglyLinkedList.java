package DataStructure;
/*
Main Linked Lists Operations:
    Insert: inserts an element into the list
    Delete: removes and returns the specified position element from the list
Auxiliary Linked Lists Operations
    Delete List: removes all elements of the list
    Count: retruns the number of elements in the list
    Find nth node from the end of the list
 */


import java.util.LinkedList;

public class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
        void setData (int data) {
            this.data = data;
        }
        int getData () {
            return data;
        }
        void setNext (Node next) {
            this.next = next;
        }
        Node getNext () {
            return this.next;
        }
    }

    public SinglyLinkedList insert (SinglyLinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static void printList (SinglyLinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    
}
