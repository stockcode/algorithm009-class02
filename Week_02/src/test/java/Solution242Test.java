import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution242Test {

    @Test
    public void isAnagram() {
        Solution242 solution242 = new Solution242();
        Assert.assertTrue(solution242.isAnagram("anagram", "nagaram"));
        Assert.assertFalse(solution242.isAnagram("rat", "car"));
    }
}