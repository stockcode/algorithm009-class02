import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int index = map.getOrDefault(target - nums[i], -1);
            if (index >= 0 && index != i) {
                return new int[] {i, index};
            }
        }
        return new int[0];
    }
}