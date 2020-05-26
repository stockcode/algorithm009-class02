import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution239Test {

    @Test
    public void maxSlidingWindow1() {
        Solution239 solution239 = new Solution239();
        int[] result = solution239.maxSlidingWindow1(new int[]{1,3,-1,-3,5,3,6,7}, 3);

        Assert.assertArrayEquals(new int[]{3,3,5,5,6,7}, result);
    }

    @Test
    public void maxSlidingWindow2() {
        Solution239 solution239 = new Solution239();
        int[] result = solution239.maxSlidingWindow2(new int[]{1,3,-1,-3,5,3,6,7}, 3);

        Assert.assertArrayEquals(new int[]{3,3,5,5,6,7}, result);
    }
}