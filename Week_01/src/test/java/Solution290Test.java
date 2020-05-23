import org.junit.Assert;
import org.junit.Test;

public class Solution290Test {

    @Test
    public void wordPattern() {
        Solution290 solution290 = new Solution290();
        Assert.assertTrue(solution290.wordPattern("abba", "dog cat cat dog"));
    }
}
