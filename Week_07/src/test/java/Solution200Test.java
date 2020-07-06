import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution200Test {

    @Test
    public void numIslands() {
        Solution200 solution200 = new Solution200();
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        Assert.assertEquals(1, solution200.numIslands(grid));
    }
}