package p225ImplementStackusingQueues;
/**
 * Description:用两个队列实现一个stack
 * Tip：使用newestval来记录top()的返回值，在push和pop过程中都要对这个值进行更新
 * push：永远将push的新的值加到不为空的那一个队列的队尾
 * pop：将不为空的队列的size - 1个元素遍历放入另外一个为空的队列中，然后返回非空队列的倒数第一个值
 * Empty：若两个队列都为空则返回true
 */

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> queue1;
    private ArrayList<Integer> queue2;
    private int newestVal;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new ArrayList<>();
        queue2 = new ArrayList<>();
        newestVal = -1;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue1.isEmpty())
            queue2.add(x);
        else
            queue1.add(x);
        newestVal = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int popVal = 0;
        if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size - 1; i++) {
                queue2.add(queue1.remove(0));
            }
            if (!queue2.isEmpty())
                newestVal = queue2.get(queue2.size() - 1);
            popVal = queue1.remove(0);
        }else {
            int size = queue2.size();
            for (int i = 0; i < size - 1; i++) {
                queue1.add(queue2.remove(0));
            }
            if (!queue1.isEmpty())
                newestVal = queue1.get(queue1.size() - 1);
            popVal = queue2.remove(0);
        }
        return popVal;
    }

    /** Get the top element. */
    public int top() {
        return newestVal;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
