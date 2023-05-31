package Trees.Questions;

import java.util.Stack;
//https://leetcode.com/problems/binary-tree-inorder-traversal/

public class InOrder_Iterative {
    TreeNode root;

    public void inOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }
    public void createTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);

        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
        fifth.left = eight;
        third.left = six;
        third.right = seven;
    }

    public static void main(String[] args) {
        InOrder_Iterative i = new InOrder_Iterative();
        i.createTree();
        i.inOrderIterative();
    }
}
