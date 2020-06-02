import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution05Test {

    @Test
    public void replaceSpace() {
        Solution05 solution05 = new Solution05();
        Assert.assertEquals(solution05.replaceSpace("We are happy."), "We%20are%20happy.");
    }
}