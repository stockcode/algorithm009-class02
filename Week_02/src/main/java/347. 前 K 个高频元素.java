import java.util.*;

class Solution347 {
    public int[] topKFrequent1(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((n1, n2) -> map.get(n2) - map.get(n1));

        for (Integer i: map.keySet()) {
            queue.add(i);
        }

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
    }
}