import java.util.HashMap;
import java.util.Map;

class Solution169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp =  map.getOrDefault(nums[i], 0);
            map.put(nums[i], temp + 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > nums.length / 2) return entry.getKey();
        }

        return -1;
    }
}