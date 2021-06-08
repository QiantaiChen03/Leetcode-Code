package DataStructure;

public class Queue {
    //Linked list implementation

    private Node first;
    private Node last;
    private int n;
    private class Node {
        int item;
        Node next;
    }

    Queue() {}

    public void enqueue (int item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        n++;
    }
    public int dequeue () {
        int item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

    public boolean isEmpty () {
        return first == null;
    }

    public int size () {
        return n;
    }
}
