public class TreeNode{
    // BST attributes
    int val;
    TreeNode left, right;

    private void inOrderTraverse(TreeNode root) {
        // Base case: if we meet null node, return
        if (root == null) return;

        inOrderTraverse(root.left);
        System.out(root.val + " ");
        inOrderTraverse(root.right);
    }
}