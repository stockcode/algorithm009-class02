import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution912Test {

    @Test
    public void sortArrayXuanZe() {
        Solution912 solution912 = new Solution912();
        Assert.assertArrayEquals(new int[]{1,2,3,5}, solution912.sortArrayXuanZe(new int[] {5,2,3,1}));
        Assert.assertArrayEquals(new int[]{1,2,3,5}, solution912.sortArrayDui(new int[] {5,2,3,1}));
    }
}