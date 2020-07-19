import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution5Test {

    @Test
    public void longestPalindrome() {
        Solution5 solution5 = new Solution5();
        Assert.assertEquals("aba", solution5.longestPalindrome("babad"));
    }
}