class Solution231 {
    public boolean isPowerOfTwo1(int n) {
        if (n <= 0) return false;

        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) return false;
            n = n >> 1;
        }
        return true;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}