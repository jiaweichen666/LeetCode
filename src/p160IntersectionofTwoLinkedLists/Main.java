package p160IntersectionofTwoLinkedLists;

public class Main {
    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        Solution solution = new Solution();
        System.out.println(solution.getIntersectionNode(listNode2,listNode3).val);
    }
}
