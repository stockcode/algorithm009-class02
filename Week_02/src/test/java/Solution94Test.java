import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution94Test {

    @Test
    public void inorderTraversal() {
        Solution94 solution94 = new Solution94();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = solution94.inorderTraversal(root);
        Assert.assertEquals(Arrays.asList(1,3,2), result);
    }
}