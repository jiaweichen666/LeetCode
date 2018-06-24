package p143ReorderList;

import java.util.Stack;

/**
 * Description:Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

 You may not modify the values in the list's nodes, only nodes itself may be changed.
 TIP：我的做法不好，需要两次遍历链表同时空间复杂度为O(n)
 最佳解法是第一遍遍历找到中间节点，将中间节点之后的节点逆置
 之后从第一个节点和中间节点同时开始进行reorder：
 public void reorderList(ListNode head) {
 if(head==null||head.next==null) return;

 //Find the middle of the list
 ListNode p1=head;
 ListNode p2=head;
 while(p2.next!=null&&p2.next.next!=null){
 p1=p1.next;
 p2=p2.next.next;
 }

 //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
 ListNode preMiddle=p1;
 ListNode preCurrent=p1.next;
 while(preCurrent.next!=null){
 ListNode current=preCurrent.next;
 preCurrent.next=current.next;
 current.next=preMiddle.next;
 preMiddle.next=current;
 }

 //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
 p1=head;
 p2=preMiddle.next;
 while(p1!=preMiddle){
 preMiddle.next=p2.next;
 p2.next=p1.next;
 p1.next=p2;
 p1=p2.next;
 p2=preMiddle.next;
 }
 }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while (p != null){
            stack.push(p);
            p = p.next;
        }
        p = head;
        ListNode q = p.next;
        while (p != stack.peek() && q != stack.peek()){
            ListNode m = stack.pop();
            p.next = m;
            m.next = q;
            p = q;
            q = q.next;
        }
        if (p == stack.peek()){
            p.next = null;
        }else if (q == stack.peek()){
            q.next = null;
        }
    }
}
