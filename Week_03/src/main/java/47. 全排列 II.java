import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution47 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        Stack<Integer> path = new Stack<>();
        boolean[] used = new boolean[nums.length];

        Arrays.sort(nums);

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

            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) continue;

            path.push(nums[i]);
            used[i] = true;
            helper(nums, used, path);
            path.pop();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        System.out.println(solution47.permuteUnique(new int[]{1,1,2}));
    }
}