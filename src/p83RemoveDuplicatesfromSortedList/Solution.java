package p83RemoveDuplicatesfromSortedList;
/* Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.*/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode p  = head;
        ListNode q = head.next;
        while(q!=null){
            while(q.next!=null&&p.val == q.val){
                q = q.next;//如果一直都是相同的值，则一直向后找，直到找到不同值或者到最后一个值为止
            }if (q.next == null&&p.val == q.val){//直到最后一个值都没有找到相异值
                q = q.next;
            }else {//如果找到了，则继续
                p.next = q;
                p = q;
                q = q.next;
            }
        }
        p.next = null;
        return  head;
    }
}
