import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution860Test {

    @Test
    public void lemonadeChange() {
        Solution860 solution860 = new Solution860();
        Assert.assertTrue(solution860.lemonadeChange(new int[]{5,5,5,10,20}));
        Assert.assertTrue(solution860.lemonadeChange(new int[]{5,5,10}));
        Assert.assertFalse(solution860.lemonadeChange(new int[]{10, 10}));
        Assert.assertTrue(solution860.lemonadeChange(new int[]{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
    }
}