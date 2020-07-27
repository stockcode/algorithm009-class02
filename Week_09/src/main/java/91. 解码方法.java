class Solution91 {
    public int numDecodings(String s) {
        int m = s.length();
        if (m < 2) return m;

        int[] dp = new int[m];
        dp[0] = 1;

        for (int i = 1; i < m; i++) {
            if (Integer.parseInt(s.substring(i-1, 2)) < 27)
                dp[i] = dp[i-1] + 1;
            else
                dp[i] = dp[i-1];
        }

        return dp[m - 1];
    }
}