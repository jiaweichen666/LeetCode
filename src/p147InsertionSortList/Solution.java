package p147InsertionSortList;

/**
 * Description:给定一个链表，对链表进行插入排序操作
 * Tip：设定一个dummyNode，每次从dummynode开始找到下一个待排序节点的插入点，执行插入排序操作。
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        ListNode next = null;
        ListNode pre = dummy;
        while (current != null){
            next = current.next;
            while (pre.next != null && pre.next.val < current.val){
                pre = pre.next;
            }//第一个节点上面的while循环不执行，所以第一个节点的next值为null
            current.next = pre.next;
            pre.next = current;
            current = next;
            pre = dummy;
        }
        return dummy.next;
    }
}
