class Solution42 {

    //方法一、暴力法
    //对于数组中的每个元素，我们找出下雨后水能达到的最高位置，等于两边最大高度的较小值减去当前高度的值。

    //时间复杂度： O(n^2)。数组中的每个元素都需要向左向右扫描。
    //空间复杂度 O(1) 的额外空间。
    public int trap1(int[] height) {
        int area = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int max_left = 0, max_right = 0;

            for (int j = i; j >= 0; j--) {
                max_left = Math.max(max_left, height[j]);
            }

            for (int j = i; j < size; j++) {
                max_right = Math.max(max_right, height[j]);
            }

            area += Math.min(max_left, max_right) - height[i];
        }

        return area;
    }


    //方法二：动态规划
    //时间复杂度：O(n)。
    //  存储最大高度数组，需要两次遍历，每次O(n)。
    //  最终使用存储的数据更新area，O(n)。
    //空间复杂度：O(n) 额外空间。
    //  和方法 1 相比使用了额外的O(n)空间用来放置left_max和right_max数组。
    public int trap2(int[] height) {
        int area = 0;
        int size = height.length;
        if (size < 3) return 0;

        int[] left_max_array = new int[size];
        int[] right_max_array = new int[size];

        //建立数组中从下标i到最左端最高的条形块高度left_max数组。
        left_max_array[0] = height[0];
        for (int i = 1; i < size; i++) {
            left_max_array[i] = Math.max(left_max_array[i - 1], height[i]);
        }

        //建立数组中从下标 i 到最右端最高的条形块高度right_max数组。
        right_max_array[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right_max_array[i] = Math.max(right_max_array[i + 1], height[i]);
        }

        //扫描数组height并更新答案
        for (int i = 0; i < size; i++) {
            area += Math.min(left_max_array[i], right_max_array[i]) - height[i];
        }

        return area;
    }

    //方法三：双指针
    //时间复杂度：O(n)。单次遍历的时间O(n)。
    //空间复杂度：O(1)的额外空间。left, right, left_max和right_max只需要常数的空间。
    public int trap3(int[] height) {
        int area = 0;
        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > left_max) {
                    left_max = Math.max(left_max, height[left]);
                } else {
                    area += left_max - height[left];
                }
                left++;
            } else {
                if (height[right] > right_max) {
                    right_max = Math.max(right_max, height[right]);
                } else {
                    area += right_max - height[right];
                }
                right--;
            }
        }

        return area;
    }
}