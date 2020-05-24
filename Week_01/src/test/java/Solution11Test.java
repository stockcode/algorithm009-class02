import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution11Test {

    @Test
    public void maxArea1() {
        Solution11 solution11 = new Solution11();
        int[] data = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution11.maxArea1(data);
        Assert.assertEquals(49, result);
    }

    @Test
    public void maxArea2() {
        Solution11 solution11 = new Solution11();
        int[] data = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution11.maxArea2(data);
        Assert.assertEquals(49, result);
    }
}