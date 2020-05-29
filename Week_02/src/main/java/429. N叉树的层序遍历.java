import java.util.ArrayList;
import java.util.List;

class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        result.add(list);

        helper(root.children, result);

        return result;
    }

    private void helper(List<Node> children, List<List<Integer>> result) {
        if (children == null || children.size() == 0) return;

        List<Integer> list = new ArrayList<>();
        List<Node> nodes = new ArrayList<>();

        for (Node node: children) {
            list.add(node.val);
            nodes.addAll(node.children);
        }
        result.add(list);

        helper(nodes, result);
    }
}