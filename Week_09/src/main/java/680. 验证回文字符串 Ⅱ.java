class Solution680 {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isValid(s, i, j-1) || isValid(s, i+1, j);
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isValid(String s, int i, int j) {
        for (;i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}