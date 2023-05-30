package Trees.Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class PreOrderTraversal {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void createTree(TreeNode root) {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        this.root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
    }

    public List<Integer> preOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderTraversal(root, list);
        return list;
    }

    public void preOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {
        PreOrderTraversal p = new PreOrderTraversal();
        p.createTree(p.root);
        List<Integer> g = new ArrayList<>();
        p.preOrder(p.root);
    }
}