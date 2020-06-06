import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution77 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {


        helper(n, k, 1, new Stack<>());

        return result;
    }

    private void helper(int n, int k, int begin, Stack<Integer> stack) {
        if (stack.size() == k) {
            result.add(new ArrayList(stack));
            return;
        }

        for (int i = begin; i <= n; i++) {
            stack.add(i);
            helper(n, k , i + 1, stack);
            stack.pop();
        }

    }

    public static void main(String[] args) {
        Solution77 solution77 = new Solution77();
        solution77.combine(4, 2);
    }
}