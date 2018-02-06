package p24SwapNodesInPairs;

public class Main {
    public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1);
    ListNode listNode2 = new ListNode(2);
    ListNode listNode3 = new ListNode(3);
    ListNode listNode4 = new ListNode(4);
    listNode1.next = listNode2;
    listNode2.next = listNode3;
    listNode3.next = listNode4;
    listNode4.next = null;
    Solution solution = new Solution();
    ListNode head = solution.swapPairs(listNode1);
    while(head != null){
        System.out.println(head.val);
        head = head.next;
    }
    }


}
