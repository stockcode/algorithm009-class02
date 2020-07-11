import java.util.PriorityQueue;

class Solution912 {
    public int[] sortArrayXuanZe(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            int tmp = nums[min];
            nums[min] = nums[i];
            nums[i] = tmp;
        }
        return nums;
    }

    public int[] sortArrayDui(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.poll();
        }
        return nums;
    }
}