import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution680Test {

    @Test
    public void validPalindrome() {
        Solution680 solution680 = new Solution680();
        Assert.assertTrue(solution680.validPalindrome("deeee"));
        Assert.assertTrue(solution680.validPalindrome("abca"));
    }
}