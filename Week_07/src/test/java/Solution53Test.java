import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution53Test {

    @Test
    public void maxSubArray() {
        Solution53 solution53 = new Solution53();
        Assert.assertEquals(6, solution53.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(-1, solution53.maxSubArray(new int[] {-2,-1}));
        Assert.assertEquals(3, solution53.maxSubArray(new int[] {1,2}));
    }
}