package Implementations.BinarySearchTree;

public class BinarySearchTree {
    TreeNode root;

    public class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void insertInBS(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insertInBS(5);
        b.insertInBS(3);
        b.insertInBS(7);
        b.insertInBS(1);
        b.insertInBS(8);
        b.insertInBS(90);
        b.inOrder();

    }
}
