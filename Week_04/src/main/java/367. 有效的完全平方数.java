class Solution367 {
    public boolean isPerfectSquare(int num) {
        int factor = num / 2;
        for (int i = 1; i <= factor; i++) {
            if (factor * factor == num) return true;
        }

        return false;
    }
}