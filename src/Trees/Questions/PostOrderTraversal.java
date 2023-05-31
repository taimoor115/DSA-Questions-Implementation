package Trees.Questions;
//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class PostOrderTraversal {
    TreeNode root;
    public void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
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
        PostOrderTraversal p = new PostOrderTraversal();
        p.createTree();
        p.postOrderTraversal(p.root);
    }
}
