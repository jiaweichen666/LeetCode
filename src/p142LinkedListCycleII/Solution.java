package p142LinkedListCycleII;

public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null)
                return null;
            ListNode meetNode = isCircle(head);
            if (meetNode == null)
                return null;
            int circleLen = circleLen(meetNode);
            ListNode pahead = head;
            ListNode pbehind = head;
            for (int i = 0; i < circleLen - 1; i++) {
                pahead = pahead.next;
            }
            while (pahead.next != pbehind){
                pahead = pahead.next;
                pbehind = pbehind.next;
            }
            return pbehind;

        }
        private ListNode isCircle(ListNode head){
            if(head == null)
                return  null;
            ListNode pbehind = head;
            ListNode pahead = head;
            pahead = pbehind.next;
            while (pahead != null && pbehind != null){
                if (pahead == pbehind)
                    return pahead;
                pbehind = pbehind.next;
                pahead = pahead.next;
                if (pahead != null)
                    pahead = pahead.next;
            }
            return null;
        }
        private int circleLen(ListNode pmeet){
            ListNode p = pmeet.next;
            int circleLen = 1;
            while (p != pmeet){
                circleLen++;
                p = p.next;
            }
            return circleLen;
        }

}
