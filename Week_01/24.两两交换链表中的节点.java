/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            // 获取两个节点
            ListNode first = cur.next;
            ListNode second = cur.next.next;

            //交换节点
            cur.next = second;
            first.next = second.next;
            second.next = first;

            //前进
            cur = first;
        }
        return dummy.next;
    }
}