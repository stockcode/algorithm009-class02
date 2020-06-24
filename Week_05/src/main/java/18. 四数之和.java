import java.util.*;

class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        if (nums.length < 4) return new ArrayList<>(ans);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int key = target - (nums[i] + nums[j] + nums[k]);
                    int index = map.getOrDefault(key, -1);
                    if (index != -1 && index != i && index !=j && index != k) {
                        Integer[] res = new Integer[] {nums[i], nums[j], nums[k], nums[index]};
                        Arrays.sort(res);
                        ans.add(Arrays.asList(res));
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}