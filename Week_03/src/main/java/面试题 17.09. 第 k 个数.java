class Solution1709 {
    public int getKthMagicNumber(int k) {
        int[] dp = new int[k+1];
        dp[1] = 1;
        int p3=1, p5=1, p7=1;
        for (int i = 2; i <= k; i++) {
            int min = Math.min(Math.min(dp[p3]*3, dp[p5] *5), dp[p7]*7);
            dp[i] = min;
            if (dp[p3] * 3 == min) p3++;
            if (dp[p5] * 5 == min) p5++;
            if (dp[p7] * 7 == min) p7++;
        }

        return dp[k];
    }
}