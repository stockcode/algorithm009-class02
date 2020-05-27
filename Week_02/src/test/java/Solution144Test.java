import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution144Test {

    @Test
    public void preorderTraversal() {
        Solution144 solution144 = new Solution144();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = solution144.preorderTraversal(root);
        Assert.assertEquals(Arrays.asList(1,2,3), result);
    }
}