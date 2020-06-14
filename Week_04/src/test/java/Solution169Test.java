import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution169Test {

    @Test
    public void majorityElement() {
        Solution169 solution169 = new Solution169();
        Assert.assertEquals(3, solution169.majorityElement(new int[]{3,2,3}));
        Assert.assertEquals(2, solution169.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}