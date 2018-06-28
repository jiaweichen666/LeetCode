package p160IntersectionofTwoLinkedLists;

/**
 * Description:找到两个链表的交叉节点。要求线性时间复杂度，和O（1）的辅助空间，如果没有交叉节点则返回null
 * Tip：先计算两个链表的长度，长链表先走掉多出来的那几步然后两个指针同时往前走，若走到null还没发现公共节点则不存在返回null
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        int lena = 0;
        int lenb = 0;
        ListNode p = headA;
        while (p != null){
            lena++;
            p = p.next;
        }
        p = headB;
        while (p != null){
            lenb++;
            p = p.next;
        }
        p = headA;
        ListNode q = headB;
        if (lena > lenb){
            int difference = lena - lenb;
            while (p != null && difference-- > 0)
                p = p.next;
            if (p == null)
                return null;
        }else if (lenb > lena){
            int difference = lenb - lena;
            while (q != null && difference-- > 0)
                q = q.next;
            if (q == null)
                return null;
        }
        while (p != null && q != null){
            if (p == q)
                return p;
            p = p.next;
            q = q.next;
        }
        return null;
    }
}