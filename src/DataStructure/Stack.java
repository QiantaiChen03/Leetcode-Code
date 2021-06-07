package DataStructure;

public class Stack {

    private int[] arr; // Stack Entries
    private int n; // Stack size

    public Stack (int capacity) {
        arr = new int[capacity];
    }

    public void push (int item) {
        arr[n++] = item;
    }

    public int pop () {
        return arr[--n];
    }

    public boolean isEmpty () {
        return n == 0;
    }

    public int size () {
        return n;
    }

    public static void main (String[] args) {
        Stack array = new Stack(10);

        for (int i = 0; i < 10; i++){
            array.push(i);
            if (!array.isEmpty()) {
                System.out.print(array.pop() + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            array.push(i);
        }
        if (!array.isEmpty()) {
            System.out.print(array.pop() + " ");
        }

    }

}
