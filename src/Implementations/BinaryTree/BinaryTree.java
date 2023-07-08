package Implementations.BinaryTree;

public class  BinaryTree {

    public TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode right;
        private TreeNode left;

        //        Constructor
        TreeNode(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public void createTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.createTree();
        t.preOrder(t.root);

    }
}
