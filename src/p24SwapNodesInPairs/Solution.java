package p24SwapNodesInPairs;


public class Solution {//只保留对current的更新，简洁明了；第一次更新少一个节点，遂加了0节点。
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null && current.next.next != null){//排除奇数节点和null节点
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = current.next.next;
        }
        return dummy.next;
    }
}
