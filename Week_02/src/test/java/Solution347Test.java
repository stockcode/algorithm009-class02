import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution347Test {

    @Test
    public void topKFrequent1() {
        Solution347 solution347 = new Solution347();
        Assert.assertArrayEquals(new int[]{1,2}, solution347.topKFrequent1(new int[]{1,1,1,2,2,3}, 2));
    }
}