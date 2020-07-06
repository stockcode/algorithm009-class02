import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution191Test {

    @Test
    public void hammingWeight() {
        Solution191 solution191 = new Solution191();
        Assert.assertEquals(1, solution191.hammingWeight(1));
        Assert.assertEquals(3, solution191.hammingWeight(11));
        Assert.assertEquals(31, solution191.hammingWeight(-3));
    }
}