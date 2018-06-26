package p146LRUCache;
/**
 * Description:LRU
 * Tip:实现了一个链表，使用head和tail指针防止越界，
 * 每次加入node时＋在表头，
 * 使用hashmap来判断put时链表中是否存在指定node，若不存在则加入hashmap和链表，同时判断是否超过了capacity，若超过则删除链表尾部的node
 * 若put时存在指定node则更新node的value后将node移到链表头部
 * get时通过hashmap判断指定node是否存在，若不存在返回-1，若存在则直将node移到链表头部并且返回相应的值
 */

import java.util.HashMap;

public class LRUCache {
    private DLinkedNode head,tail;
    private int capacity;
    private int count;
    private HashMap<Integer,DLinkedNode> hashMap = new HashMap<>();
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode post;
    }
    private void addNode(DLinkedNode node){
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }
    private void removeNode(DLinkedNode node){
        DLinkedNode pre = node.pre;
        DLinkedNode post = node.post;
        pre.post = post;
        post.pre = pre;
    }
    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }
    private DLinkedNode popTail(){
        DLinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }
    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.pre = null;
        tail.post = null;
        head.post = tail;
        tail.pre = head;
    }

    public int get(int key) {
        DLinkedNode node = hashMap.get(key);
        if (node == null)
            return -1;
        else {
            this.moveToHead(node);
            return node.value;
        }
    }

    public void put(int key, int value) {
        DLinkedNode node = hashMap.get(key);
        if (node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            this.hashMap.put(key,newNode);//虽然在push进hashmap的时候node的pre和post指针没有变化，
            this.addNode(newNode);//但是在这一步中newNode引用指向的实例的pre和post指针产生了变化，相应的存在hashmap中的也变了。
            count++;
            if (count > capacity){
                DLinkedNode tail = this.popTail();
                this.hashMap.remove(tail.key);
                --count;
            }
        }else {
            node.value = value;
            this.moveToHead(node);
        }
    }
}
