import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1709Test {

    @Test
    public void getKthMagicNumber() {
        Solution1709 solution1709 = new Solution1709();
        Assert.assertEquals(9, solution1709.getKthMagicNumber(5));
    }
}