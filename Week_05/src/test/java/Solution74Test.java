import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution74Test {

    @Test
    public void searchMatrix() {
        Solution74 solution74 = new Solution74();
//        int[][] data = { {1,   3,  5,  7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
//        Assert.assertTrue(solution74.searchMatrix(data, 3));
//        Assert.assertFalse(solution74.searchMatrix(data, 13));

        int[][] data1 = {{1,3,5,7}, {10,11,16,20}, {23,30,34,50}};
        Assert.assertTrue(solution74.searchMatrix(data1, 11));
    }
}