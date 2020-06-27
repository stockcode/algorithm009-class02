import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution621Test {

    @Test
    public void leastInterval() {
        Solution621 solution621 = new Solution621();
        Assert.assertEquals(8, solution621.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }
}