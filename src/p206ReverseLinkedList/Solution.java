package p206ReverseLinkedList;

/**
 * Description:翻转链表
 * Tip：为什么我总是忘。。
 */
public class Solution {
    /*public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        else {
            ListNode newhead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newhead;
        }
    }*/
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode p = head;
        ListNode newhead = null;
        while (p != null){
            ListNode pnext = p.next;
            if (pnext == null)
                newhead = p;
            p.next = pre;
            pre = p;
            p = pnext;
        }
        return newhead;
    }
}
