import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution455Test {

    @Test
    public void findContentChildren() {
        Solution455 solution455 = new Solution455();
        Assert.assertEquals(1, solution455.findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        Assert.assertEquals(2, solution455.findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }
}