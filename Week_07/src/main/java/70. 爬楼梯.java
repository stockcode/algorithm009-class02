class Solution70 {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1,second = 2;
        for (int i = 2; i < n; i++) {
            int tmp = first;
            first = second;
            second = tmp + first;
        }

        return second;
    }
}