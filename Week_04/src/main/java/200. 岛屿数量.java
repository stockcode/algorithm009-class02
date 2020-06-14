class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') result++;
                dfs(grid, i, j);
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;

        grid[r][c] = '0';

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r,c + 1);
        dfs(grid, r,c - 1);
    }
}