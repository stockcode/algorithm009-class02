import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution91Test {

    @Test
    public void numDecodings() {
        Solution91 solution91 = new Solution91();
        Assert.assertEquals(2, solution91.numDecodings("12"));
        Assert.assertEquals(3, solution91.numDecodings("226"));
    }
}