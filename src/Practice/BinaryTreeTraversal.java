package Practice;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Stack;

public class BinaryTreeTraversal {
    public class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        public TreeNode (int v) {
            this.val = v;
        }
    }



    public TreeNode buildBalanceBST(int[] a){

        Arrays.sort(a);
        return buildBalanceBST(a, 0, a.length-1);
    }

    private TreeNode buildBalanceBST(int[] a, int l, int r){
        if(l<=r) {
            int m = (l + r) / 2;
            TreeNode node = new TreeNode(a[m]);
            node.left = buildBalanceBST(a, l, m-1);
            node.right = buildBalanceBST(a, m+1, r);
            return node;
        }
        return null;
    }



    public void inorderRecursion (TreeNode root) {
        if (root == null) {
            return;
        }
        inorderRecursion(root.left);
        System.out.print(root.val + " ");
        inorderRecursion(root.right);
    }

    public void inorderWithStack (TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            System.out.print(p.val + " ");
            p = p.right;
        }
    }

    public void inorderTwoPointer (TreeNode root) {
        TreeNode cur = root;
        TreeNode pre = null;

        while (cur != null) {
            if (cur.left == null) {
                System.out.print(cur.val + " ");
                cur = cur.right;
            } else {
                pre = cur.left;
                while (pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    pre.right = null;
                    System.out.print(cur.val + " ");
                    cur = cur.right;
                }
            }
        }
    }

    public static void main (String[] args) {
        BinaryTreeTraversal  btt = new BinaryTreeTraversal();
        int[] a = {1, 3,4,6, 7, 8, 9, 10, 12, 15,16,18,20,21,24,27,33,36};
        TreeNode root = btt.buildBalanceBST(a);
        System.out.println("root --> "+ root.val);

        BinaryTreeTraversal tr = new BinaryTreeTraversal();
        tr.inorderRecursion(root);
        System.out.println();
        tr.inorderWithStack(root);
        System.out.println();
        tr.inorderTwoPointer(root);


    }

}




















