import java.util.ArrayList;
import java.util.List;

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        helper(0, 0, n, "", ans);

        return ans;
    }

    private void helper(int left, int right, int n, String s, List<String> ans) {
        if (left == n && right == n) {
            ans.add(s);
            return;
        }

        if (left < n) {
            helper(left + 1, right, n, s + "(", ans);
        }

        if (right < left) {
            helper(left, right + 1, n, s + ")", ans);
        }

    }
}