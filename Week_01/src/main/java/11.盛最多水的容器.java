class Solution11 {

    //完全枚举：left bar, right bar, (x-y) * height_diff 时间复杂度：O(n^2)
    public int maxArea1(int[] a) {
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                int area = (j - i) * Math.min(a[i], a[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    //左右边界i, j，向中间收敛，左右加逼。时间复杂度：O(n)
    public int maxArea2(int[] a) {
        int max = 0;
        for(int i = 0, j = a.length - 1; i < j;) {
            int minHeight = a[i] < a[j] ? a[i++] : a[j--];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }
}