import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution387Test {

    @Test
    public void firstUniqChar() {
        Solution387 solution387 = new Solution387();
        Assert.assertEquals(0, solution387.firstUniqChar("leetcode"));
        Assert.assertEquals(2, solution387.firstUniqChar("loveleetcode"));
    }
}