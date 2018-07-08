package p234PalindromeLinkedList;

/**
 * Description：给定一个链表，判断这个链表是否是回文链表
 * Tip：1.先找到链表的中间节点
 * 2.reverse链表的后半段
 * 3.两个指针从头开始同步向后移动，若有任何一对值不一样则返回false
 * 若遍历到psecond = null则说明是回文链表
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;//让后一半的长度略短
        }
        fast = reverse(slow);
        slow = head;
        while (fast != null){
            if (slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        if (head == null || head.next == null)
            return head;
        else {
            ListNode newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }
}
