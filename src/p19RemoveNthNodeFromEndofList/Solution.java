package p19RemoveNthNodeFromEndofList;
/*设置三个指针，p，q，l
先让l指针领先p指针n步
再同步后移，等l指针指向最后一个元素时，p指针即指向需要删除的元素的前面的一个元素
进行删除操作。
* */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p,q,l;
        p = head;
        q = head;
        l = head;
        while(n > 0 && l.next != null){//让l指针领先p指针n步
            l = l.next;
            n--;
        }
        if (n != 0){//若删除的是第一个元素，则n不会为0，直接返回去除第一个元素后的链表
            p = head.next;
            return p;
        }
        while(l.next != null){
            l = l.next;
            p = p.next;
        }
        q = p.next.next;
        p.next = q;
        return head;
    }
}
