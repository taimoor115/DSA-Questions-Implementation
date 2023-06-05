package Trees.Questions.BST;

//https://leetcode.com/problems/validate-binary-search-tree/
public class ValidBST {
    TreeNode root;
    long min = Integer.MIN_VALUE;
    long max = Integer.MAX_VALUE;

    public boolean isValidBST() {
        return isValid(root, min, max);
    }

    public boolean isValid(TreeNode root, long min, long max) {
//        Base Case
        if (root == null) {
            return true;
        }
//        Main Case(For Checking Not Valid Condition)
        if (root.data <= min || root.data >= max) {
            return false;
        }
//        Recursive Case
        boolean left = isValid(root.left, min, root.data);
        if (left) { //we can only enter if the left subtree is valid
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public void insert(int value) {
        root = insertIntoBST(root, value);
    }

    public TreeNode insertIntoBST(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertIntoBST(root.left, value);
        } else {
            root.right = insertIntoBST(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        ValidBST v = new ValidBST();
        v.insert(17);
        v.insert(2);
        v.insert(3);
        v.insert(44);
        v.insert(5);
        v.insert(6);
        v.inOrder();
        System.out.print(v.isValidBST());
    }
}
