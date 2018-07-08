package p237DeleteNodeinaLinkedList;

/**
 * Description:给定要删除的链表节点的引用，原地删除这个node
 * Tip将节点的val设置为他的下一节点的val，然后让next指针指向他next节点的next指针指向的值
 */
public class Solution {
    public void deleteNode(ListNode node){
        if (node == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
