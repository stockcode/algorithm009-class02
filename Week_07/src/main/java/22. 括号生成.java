import java.util.ArrayList;
import java.util.List;

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        helper(0, 0, n, "", result);
        return result;
    }

    private void helper(int left, int right, int n, String str, List<String> result) {
        if (left == n  && right == n) {
            result.add(str);
            return;
        }

        if (left < n) {
            helper(left + 1, right, n, str + "(", result);
        }
        if (right < left) {
            helper(left, right + 1, n, str + ")", result);
        }

    }
}