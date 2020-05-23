import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution42Test {

    @Test
    public void trap1() {
        Solution42 solution42 = new Solution42();
        int[] data = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        Assert.assertEquals(6, solution42.trap1(data));
    }

    @Test
    public void trap2() {
        Solution42 solution42 = new Solution42();
        int[] data = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        Assert.assertEquals(6, solution42.trap2(data));
    }

    @Test
    public void trap3() {
        Solution42 solution42 = new Solution42();
        int[] data = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        Assert.assertEquals(6, solution42.trap3(data));
    }
}