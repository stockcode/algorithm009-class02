import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution213Test {

    @Test
    public void rob() {
        Solution213 solution213 = new Solution213();
        Assert.assertEquals(3, solution213.rob(new int[]{2,3,2}));
        Assert.assertEquals(4, solution213.rob(new int[]{1,2,3,1}));
    }
}