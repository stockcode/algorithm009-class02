class Solution572 {
    public boolean isSubtree1(TreeNode s, TreeNode t) {
        if (s == null) return false;

        return isSameTree(s, t) || isSubtree1(s.left, t) || isSubtree1(s.right, t);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        //terminator
        if (p == null || q == null) {
            return p == q;
        }

        //current logic
        if (p.val != q.val) return false;

        //drill down
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}