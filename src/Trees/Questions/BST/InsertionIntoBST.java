package Trees.Questions.BST;
//https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
public class InsertionIntoBST {
    TreeNode root;

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
}
