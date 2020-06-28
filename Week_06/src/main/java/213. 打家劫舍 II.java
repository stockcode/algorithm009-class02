class Solution213 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length<=2) {
            return (nums.length==2) ? Math.max(nums[0],nums[1]) : nums[0];
        }

        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            int tmp = second;
            second = Math.max(first + nums[i], tmp);
            first = tmp;
        }

        int max1 = second;

        first = nums[1];
        second = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            int tmp = second;
            second = Math.max(first + nums[i], tmp);
            first = tmp;
        }

        int max2 = second;

        return Math.max(max1, max2);
    }
}