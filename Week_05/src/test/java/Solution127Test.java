import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution127Test {

    @Test
    public void ladderLength() {
        Solution127 solution127 = new Solution127();
        Assert.assertEquals(2, solution127.ladderLength("a", "c", Arrays.asList(new String[]{"a","b","c"})));
        Assert.assertEquals(5, solution127.ladderLength("hit", "cog", Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"})));
    }
}