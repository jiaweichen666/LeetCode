package p19RemoveNthNodeFromEndofList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p,q,l;
        p = head;
        q = head;
        l = head;
        for (int i = 0;i < n;i++){
            l = l.next;
        }
        while(l.next != null){
            l = l.next;
            p = p.next;
        }
        q = p.next.next;
        p.next = q;
        return head;
    }
}
