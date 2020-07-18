import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution151Test {

    @Test
    public void reverseWords() {
        Solution151 solution151 = new Solution151();
        Assert.assertEquals("world! hello", solution151.reverseWords("  hello world!  "));
        Assert.assertEquals("blue is sky the", solution151.reverseWords("the sky is blue"));
    }
}