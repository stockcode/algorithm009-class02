import org.junit.Assert;
import org.junit.Test;

public class Solution299Test {

    @Test
    public void test1() {
        Solution299 solution299 = new Solution299();
        String result = solution299.getHint("1807", "7810");
        Assert.assertEquals(result, "1A3B");

        result = solution299.getHint("1123", "0111");
        Assert.assertEquals(result, "1A1B");

    }

    @Test
    public void test2() {
        Solution299 solution299 = new Solution299();
        String result = solution299.getHint1("1807", "7810");
        Assert.assertEquals(result, "1A3B");

        result = solution299.getHint1("1123", "0111");
        Assert.assertEquals(result, "1A1B");

    }
}
