class Solution547 {
    public int findCircleNum(int[][] M) {
        UnionSet unionSet = new UnionSet(M.length);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 1 && i != j) {
                    unionSet.union(i, j);
                }
            }
        }

        return unionSet.count;
    }
}