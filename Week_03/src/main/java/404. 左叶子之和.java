class Solution404 {
    private int result = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        helper(root, root);

        return result;
    }

    private void helper(TreeNode root, TreeNode parent) {
        if (root == null) return;

        if (root.left == null && root.right == null && parent.left == root) result += root.val;

        helper(root.left, root);
        helper(root.right, root);
    }
}