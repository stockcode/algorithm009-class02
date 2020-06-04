import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution367Test {

    @Test
    public void isPerfectSquare() {
        Solution367 solution367 = new Solution367();
        Assert.assertTrue(solution367.isPerfectSquare(16));
        Assert.assertFalse(solution367.isPerfectSquare(14));
        Assert.assertFalse(solution367.isPerfectSquare(2147483647));
    }
}