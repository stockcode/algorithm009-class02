import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution104Test {

    @Test
    public void maxDepth() {
        Solution104 solution104 = new Solution104();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(3, solution104.maxDepth(root));

    }
}