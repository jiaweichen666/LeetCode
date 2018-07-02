package p203RemoveLinkedListElements;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode p = head;
        while (p != null){
            if (p.val == val){
                pre.next = p.next;
                p = p.next;
            }else {
                pre = p;
                p = p.next;
            }
        }
        return dummy.next;
    }

}
