import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution46 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        Stack<Integer> path = new Stack<>();
        boolean[] used = new boolean[nums.length];

        helper(nums, used, path);

        return result;
    }

    private void helper(int[] nums, boolean[] used, Stack<Integer> path) {
        if (path.size() == nums.length) {
            result.add(new ArrayList(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            path.push(nums[i]);
            used[i] = true;
            helper(nums, used, path);
            path.pop();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        solution46.permute(new int[]{1,2,3});
    }
}