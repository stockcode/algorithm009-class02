import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution45Test {

    @Test
    public void jump() {
        Solution45 solution45 = new Solution45();
        Assert.assertEquals(2, solution45.jump(new int[]{2,3,1,1,4}));
    }
}