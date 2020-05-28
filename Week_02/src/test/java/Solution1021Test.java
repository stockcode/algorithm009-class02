import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1021Test {

    @Test
    public void removeOuterParentheses1() {
        Solution1021 solution1021 = new Solution1021();
        Assert.assertEquals("()()()", solution1021.removeOuterParentheses1("(()())(())"));
        Assert.assertEquals("()()()()(())", solution1021.removeOuterParentheses1("(()())(())(()(()))"));
        Assert.assertEquals("", solution1021.removeOuterParentheses1("()()"));
    }
}