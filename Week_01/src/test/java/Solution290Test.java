import org.junit.Assert;
import org.junit.Test;

public class Solution290Test {

    @Test
    public void wordPatternTest1() {
        Solution290 solution290 = new Solution290();
        String pattern = "", str = "";
        pattern = "abba"; str = "dog cat cat dog";
        Assert.assertTrue(solution290.wordPattern1(pattern, str));

        pattern = "abba"; str = "dog cat cat fish";
        Assert.assertFalse(solution290.wordPattern1(pattern, str));

        pattern = "aaaa"; str = "dog cat cat dog";
        Assert.assertFalse(solution290.wordPattern1(pattern, str));

        pattern = "abba"; str = "dog dog dog dog";
        Assert.assertFalse(solution290.wordPattern1(pattern, str));
        pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        Assert.assertTrue(solution290.wordPattern1(pattern, str));
    }

    @Test
    public void wordPatternTest2() {
        Solution290 solution290 = new Solution290();
        String pattern = "", str = "";
        pattern = "abba"; str = "dog cat cat dog";
        Assert.assertTrue(solution290.wordPattern2(pattern, str));

        pattern = "abba"; str = "dog cat cat fish";
        Assert.assertFalse(solution290.wordPattern2(pattern, str));

        pattern = "aaaa"; str = "dog cat cat dog";
        Assert.assertFalse(solution290.wordPattern2(pattern, str));

        pattern = "abba"; str = "dog dog dog dog";
        Assert.assertFalse(solution290.wordPattern2(pattern, str));

        pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        Assert.assertTrue(solution290.wordPattern2(pattern, str));
    }
}
