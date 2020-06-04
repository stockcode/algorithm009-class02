import java.util.Stack;

class Solution06 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();

        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int[] result = new int[stack.size()];
        int index = 0;
        while(stack.size() > 0) {
            result[index++] = stack.pop();
        }

        return result;
    }
}