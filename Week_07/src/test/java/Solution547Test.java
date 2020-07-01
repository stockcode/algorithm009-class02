import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution547Test {

    @Test
    public void findCircleNum() {
        Solution547 solution547 = new Solution547();
        int[][] squares = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        Assert.assertEquals(2, solution547.findCircleNum(squares));
    }
}