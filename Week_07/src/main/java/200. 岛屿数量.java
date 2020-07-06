class Solution200 {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        UnionSet unionSet = new UnionSet(m * n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    unionSet.union(i, j);
                }
            }
        }

        return unionSet.count;
    }
}