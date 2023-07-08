package Trees.Questions;

public class MaximumValueInBS {
    TreeNode root;

    public int maxInBS(TreeNode root) {
        int baseValue = Integer.MIN_VALUE;
        if (root == null) {
            return baseValue;
        }
        int result = root.data;
        int left = maxInBS(root.left);
        int right = maxInBS(root.right);
        if (left > result) {
            result = left;
        }
        if (right > result) {
            return right;
        }
        return result;
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
        MaximumValueInBS m = new MaximumValueInBS();
        m.createTree();
        System.out.println(m.maxInBS(m.root));
    }
}
