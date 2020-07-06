import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution231Test {

    @Test
    public void isPowerOfTwo() {
        Solution231 solution231 = new Solution231();
        Assert.assertTrue(solution231.isPowerOfTwo2(16));
        Assert.assertFalse(solution231.isPowerOfTwo2(218));
    }
}