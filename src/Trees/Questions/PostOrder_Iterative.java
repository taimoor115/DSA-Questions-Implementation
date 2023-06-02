package Trees.Questions;
//https://leetcode.com/problems/binary-tree-postorder-traversal/
import java.util.Stack;

public class PostOrder_Iterative {
    TreeNode root;

    public void postOrder_Iterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode prev = null;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && prev != peekNode.right) {
                    current = peekNode.right;
                } else {
                    prev = stack.pop();
                    System.out.print(prev.data + " ");
                }
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
        third.left = seven;
    }


    public static void main(String[] args) {
        PostOrder_Iterative p = new PostOrder_Iterative();
        p.createTree();
        p.postOrder_Iterative(p.root);
    }
}
