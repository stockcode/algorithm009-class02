import java.util.Deque;
import java.util.LinkedList;

class Solution239 {
    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums.length < k) return nums;

        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < result.length; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = i; j < i + k; j++) {
                if (nums[j] > max)  max = nums[j];
            }

            result[i] = max;
        }

        return result;
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums.length < k) return nums;

        int[] result = new int[nums.length - k + 1];

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!dq.isEmpty() && dq.getFirst() < i - k + 1) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && nums[dq.getLast()] < nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.getFirst()];
            }
        }

        return result;
    }
}