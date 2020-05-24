import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution70Test {

    @Test
    public void climbStairs1() {
        Solution70 solution70 = new Solution70();
        Assert.assertEquals(2, solution70.climbStairs1(2));
        Assert.assertEquals(3, solution70.climbStairs1(3));
        Assert.assertEquals(5, solution70.climbStairs1(4));
        Assert.assertEquals(8, solution70.climbStairs1(5));
    }
}