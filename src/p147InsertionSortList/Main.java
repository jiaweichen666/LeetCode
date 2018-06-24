package p147InsertionSortList;

public class Main {
    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        listNode4.next = listNode2;
        listNode2.next = listNode1;
        listNode1.next = listNode3;
        Solution solution = new Solution();
        ListNode nHead = solution.insertionSortList(listNode4);
        ListNode p = nHead;
        while (p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }
}
