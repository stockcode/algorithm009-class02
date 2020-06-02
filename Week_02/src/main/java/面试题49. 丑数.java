class Solution49 {
    public int nthUglyNumber(int n) {
        int[] un = new int[n];
        un[0] = 1;
        int u2 = 0, u3 = 0, u5 = 0;
        for (int i = 1; i < n; i++) {
            un[i] = Math.min(Math.min(un[u2] * 2, un[u3] * 3), un[u5] * 5);
            if (un[i] == un[u2] * 2) u2++;
            if (un[i] == un[u3] * 3) u3++;
            if (un[i] == un[u5] * 5) u5++;
        }
        return un[n - 1];
    }
}