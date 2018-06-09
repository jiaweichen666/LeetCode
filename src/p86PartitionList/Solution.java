package p86PartitionList;
/**
 * Description:给定链表和指定值x，调整链表使得链表中小于x的节点全部排在大于或者等于x的节点之前
 * Tips：使用两个辅助链表，遍历原链表的过程中，一个放小于x的节点，一个放大于x的节点，最后连接两个链表返回。
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;
        ListNode smaller = new ListNode(0);
        ListNode bigger = new ListNode(0);
        ListNode smallerHead = smaller;
        ListNode biggerHead = bigger;
        while (head != null){
            if (head.val < x){
                smaller.next = head;
                smaller = smaller.next;
            }else {
                bigger.next = head;
                bigger = bigger.next;
            }
            head = head.next;
        }
        bigger.next = null;//别忘了末尾结点next指针设空
        smaller.next = biggerHead.next;
        return smallerHead.next;
    }
}
