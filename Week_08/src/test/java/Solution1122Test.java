import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1122Test {

    @Test
    public void relativeSortArray() {
        Solution1122 solution1122 = new Solution1122();
        Assert.assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19}, solution1122.relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
    }
}