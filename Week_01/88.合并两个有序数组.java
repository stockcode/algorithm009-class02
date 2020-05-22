class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //初始化临时数组
        int[] tmp_nums = new int[m];

        System.arraycopy(nums1, 0, tmp_nums, 0, m);

        int pos1 = 0, pos2 = 0, pos = 0;

        //按最小值拷贝到nums1
        while (pos1 < m && pos2 < n) {
            nums1[pos++] = tmp_nums[pos1] < nums2[pos2] ? tmp_nums[pos1++] : nums2[pos2++];
        }

        //剩余的数组拷贝到nums1
        if (pos1 < m) {
            System.arraycopy(tmp_nums, pos1, nums1, pos1 + pos2, m + n - pos1 - pos2);
        } else if (pos2 < n) {
            System.arraycopy(nums2, pos2, nums1, pos1 + pos2, m + n - pos1 - pos2);
        }
    }
}