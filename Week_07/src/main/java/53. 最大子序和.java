class Solution53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int arr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > arr && arr < 0) {
                arr = nums[i];
            } else {
                arr += nums[i];
            }

            max =Math.max(max, arr);

        }

        return max;
    }
}