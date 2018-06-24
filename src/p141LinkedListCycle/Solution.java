package p141LinkedListCycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return  false;
        ListNode pbehind = head;
        ListNode pahead = head;
        pahead = pbehind.next;
        while (pahead != null && pbehind != null){
            if (pahead == pbehind)
                return true;
            pbehind = pbehind.next;
            pahead = pahead.next;
            if (pahead != null)
                pahead = pahead.next;
        }
        return false;
    }
}
