import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution874Test {

    @Test
    public void robotSim() {
        Solution874 solution874 = new Solution874();

        Assert.assertEquals(25, solution874.robotSim(new int[]{4,-1,3}, new int[][]{}));
        Assert.assertEquals(65, solution874.robotSim(new int[]{4,-1,4,-2,4}, new int[][]{{2,4}}));
    }
}