import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution72Test {

    @Test
    public void minDistance() {
        Solution72 solution72 = new Solution72();
        Assert.assertEquals(0, solution72.minDistance("a", "a"));
        Assert.assertEquals(3, solution72.minDistance("horse", "ros"));
        Assert.assertEquals(5, solution72.minDistance("intention", "execution"));
    }
}