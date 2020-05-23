class Solution26 {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[pos]) {
                nums[++pos] = nums[i];
            }
        }

        return pos+1;
    }
}