class Solution917 {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            while (!isLetter(chars[i]) && i < j) i++;
            while (!isLetter(chars[j]) && i < j) j--;

            char tmp = chars[i]; chars[i] = chars[j]; chars[j] = tmp;
        }
        return String.valueOf(chars);
    }

    private boolean isLetter(char aChar) {
        return (aChar >= 'a' && aChar <= 'z') || (aChar >= 'A' && aChar <= 'Z');
    }
}