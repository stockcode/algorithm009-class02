import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution49Test {

    @Test
    public void nthUglyNumber() {
        Solution49 solution49 = new Solution49();
        Assert.assertEquals(12, solution49.nthUglyNumber(10));
    }
}