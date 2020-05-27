import java.util.ArrayList;
import java.util.List;

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        helper(root, result);

        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);
        if (root.left != null) helper(root.left, result);
        if (root.right != null) helper(root.right, result);
    }
}