package Practice;

public class BinarySearchTree {
    public class Node {
        Node left, right;
        int data;
        public Node (int data) {
            this.data = data;
        }

        public void insert (int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null){
                        right = new Node(value);
                    } else {
                        right.insert(value);
                    }
            }
        }

        public boolean contains (int value) {
            if (value == data) {
                return true;
            } else if (value < data) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            }
        }
    }


    public void preOrderTraversal (TreeNode node) {
        if (node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void inOrderTraversal (TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal (TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }
}
