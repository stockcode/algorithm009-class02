class Solution1021 {
    public String removeOuterParentheses1(String S) {
        StringBuilder sb = new StringBuilder();
        int level = 0;

        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (c == ')')  level--;
            if (level >= 1) sb.append(c);
            if (c == '(') level++;
        }

        return sb.toString();
    }
}