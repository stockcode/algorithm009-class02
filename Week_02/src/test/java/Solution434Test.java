import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution434Test {

    @Test
    public void countSegments() {
        Solution434 solution434 = new Solution434();
        Assert.assertEquals(solution434.countSegments("Hello, my name is John"), 5);
        Assert.assertEquals(solution434.countSegments(""), 0);
        Assert.assertEquals(solution434.countSegments(", , , ,        a, eaefa"), 6);
    }
}