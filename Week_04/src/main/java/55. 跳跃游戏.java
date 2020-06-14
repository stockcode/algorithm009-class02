class Solution55 {
    public boolean canJump(int[] nums) {

        int maxReachableIndex = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= maxReachableIndex ) maxReachableIndex = i;
        }

        return maxReachableIndex == 0;
    }
}