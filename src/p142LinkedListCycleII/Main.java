package p142LinkedListCycleII;

public class Main {
    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        listNode0.next = listNode1;
        listNode1.next = listNode0;
        Solution solution = new Solution();
        System.out.println(solution.detectCycle(listNode0).val);
    }
}
