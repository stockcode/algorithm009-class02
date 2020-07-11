import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution198Test {

    @Test
    public void rob() {
        Solution198 solution198 = new Solution198();
        Assert.assertEquals(4, solution198.rob(new int[]{1,2,3,1}));
        Assert.assertEquals(12, solution198.rob(new int[]{2,7,9,3,1}));
    }
}