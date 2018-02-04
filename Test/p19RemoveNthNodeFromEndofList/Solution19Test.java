package p19RemoveNthNodeFromEndofList;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution19Test {
    @Test
    public void removeNthFromEnd() throws Exception {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        ListNode listNode21 = new ListNode(1);
        ListNode listNode22 = new ListNode(2);
        ListNode listNode23 = new ListNode(3);
        ListNode listNode24 = new ListNode(4);
        ListNode listNode25 = new ListNode(5);
        ListNode listNode26 = new ListNode(6);
        ListNode listNode27 = new ListNode(7);
        listNode21.next = listNode22;
        listNode22.next = listNode23;
        listNode23.next = listNode24;
        listNode24.next = listNode25;
        listNode25.next = listNode26;
        listNode26.next = listNode27;
        Solution solution = new Solution();
        assertEquals(listNode1,solution.removeNthFromEnd(listNode21,4));



    }

}