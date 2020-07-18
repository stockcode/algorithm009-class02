import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution557Test {

    @Test
    public void reverseWords() {
        Solution557 solution557 = new Solution557();
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc" , solution557.reverseWords("Let's take LeetCode contest"));
    }
}