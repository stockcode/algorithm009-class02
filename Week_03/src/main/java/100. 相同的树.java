class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
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