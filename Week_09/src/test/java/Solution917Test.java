import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution917Test {

    @Test
    public void reverseOnlyLetters() {
        Solution917 solution917 = new Solution917();
        Assert.assertEquals("7_28]", solution917.reverseOnlyLetters("7_28]"));
        Assert.assertEquals("j-Ih-gfE-dCba", solution917.reverseOnlyLetters("a-bC-dEf-ghIj"));
        Assert.assertEquals("Qedo1ct-eeLg=ntse-T!", solution917.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}