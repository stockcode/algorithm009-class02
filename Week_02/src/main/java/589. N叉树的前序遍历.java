import java.util.ArrayList;
import java.util.List;

class Solution589 {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        helper(root, result);

        return result;
    }

    private void helper(Node root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);

        if (root.children == null) return;

        for (Node node : root.children) {
            helper(node, result);
        }
    }
}