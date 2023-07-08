package Trees.Questions.BST;

//https://leetcode.com/problems/search-in-a-binary-search-tree/
public class SearchValueInBST {
    TreeNode root;

    public TreeNode searchInBST(int key) {
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
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

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        SearchValueInBST s = new SearchValueInBST();
        s.insert(6);
        s.insert(3);
        s.insert(9);
        s.insert(1);
        s.insert(2);
        s.insert(10);
        s.insert(17);
        s.inOrder();
        System.out.println("");
        if (s.searchInBST(99) != null) {
            System.out.print("Key Found");
        } else {
            System.out.print("Key Not Found");
        }
    }
}
