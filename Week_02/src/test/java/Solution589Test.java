import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution589Test {

    @Test
    public void preorder() {
        Solution589 solution589 = new Solution589();


        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> children3 = new ArrayList<>();
        children3.add(node5);
        children3.add(node6);

        Node node3 = new Node(3, children3);


        Node node2 = new Node(2);
        Node node4 = new Node(4);
        List<Node> children1 = new ArrayList<>();
        children1.add(node3);
        children1.add(node2);
        children1.add(node4);
        Node root = new Node(1, children1);

        Assert.assertEquals(solution589.preorder(root), Arrays.asList(1,3,5,6,2,4));
    }
}