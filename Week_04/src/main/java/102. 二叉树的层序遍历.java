import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Deque<TreeNode> deque = new LinkedList<>();

        deque.addFirst(root);

        
        while (!deque.isEmpty()) {
            TreeNode node = deque.pollLast();

            deque.addFirst(node.left);
            deque.addFirst(node.right);
        }

    }
}