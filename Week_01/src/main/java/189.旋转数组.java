
// 暴力法
class Solution189 {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotate1(nums);
        }
    }

    public void rotate1(int[] nums) {
        int next = nums[nums.length - 1];
        for(int i = 0; i < nums.length; i++) {
            int tmp = next;
            next = nums[i];
            nums[i] = tmp;
        }
    }
}

//时间复杂度：O(N*k)
//空间复杂度：O(1)