import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution22Test {

    @Test
    public void generateParenthesis() {
        Solution22 solution22 = new Solution22();
        List<String> expected = new ArrayList<>();

        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");

        Assert.assertEquals(expected, solution22.generateParenthesis(3));
    }
}