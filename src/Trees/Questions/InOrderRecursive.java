package Trees.Questions;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class InOrderRecursive {
    TreeNode root;

    public void inOrderRecursive(TreeNode root) {
        if (root == null) { // Base Case
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.data);
        inOrderRecursive(root.right);
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
        InOrderRecursive i = new InOrderRecursive();
        i.createTree();
        i.inOrderRecursive(i.root);
    }
}
