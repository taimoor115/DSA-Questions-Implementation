package Trees.Questions;

import java.util.Stack;
//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class PreOrderIterative {
    TreeNode root;

    public void preOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
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
        TreeNode seven= new TreeNode(7);
        TreeNode eight= new TreeNode(8);

        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
        fifth.left = eight;
        third.left = six;
        third.left = seven;
    }

    public static void main(String[] args) {
        PreOrderIterative p = new PreOrderIterative();
        p.createTree();
        p.preOrderIterative();

    }
}
