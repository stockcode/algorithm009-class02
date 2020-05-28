import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution412Test {

    @Test
    public void fizzBuzz() {
        Solution412 solution412 = new Solution412();

        List<String> result = solution412.fizzBuzz(15);

        List<String> expected = Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz");

        Assert.assertEquals(expected, result);
    }
}