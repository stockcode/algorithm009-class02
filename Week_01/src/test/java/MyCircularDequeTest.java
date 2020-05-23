import org.junit.Assert;
import org.junit.Test;

public class MyCircularDequeTest {
    @Test
    public void TestQueue() {
        MyCircularDeque circularDeque = new MyCircularDeque(3);

        Assert.assertTrue(circularDeque.insertLast(1));			        // 返回 true
        Assert.assertTrue(circularDeque.insertLast(2));			        // 返回 true
        Assert.assertTrue(circularDeque.insertFront(3));			        // 返回 true
        Assert.assertFalse(circularDeque.insertFront(4));			        // 已经满了，返回 false
        Assert.assertEquals(circularDeque.getRear(), 2);  				// 返回 2
        Assert.assertTrue(circularDeque.isFull());				        // 返回 true
        Assert.assertTrue(circularDeque.deleteLast());			        // 返回 true
        Assert.assertTrue(circularDeque.insertFront(4));			        // 返回 true
        Assert.assertEquals(circularDeque.getFront(), 4);				// 返回 4

    }
}
