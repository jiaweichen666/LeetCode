package p116PopulatingNextRightPointersinEachNode;
/**
 * Description:给定完全二叉树，给每一层的节点添加指向右边节点的next指针值
 * Tip：层序遍历
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //层序遍历，遍历第n层的时候调整第n层的节点
    /*public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        List<TreeLinkNode> linkNodeList = new ArrayList<>();
        TreeLinkNode cur = null;
        TreeLinkNode next = null;
        linkNodeList.add(root);
        while (! linkNodeList.isEmpty()){
            int size = linkNodeList.size();
            for (int i = 0; i < size ; i++) {
                cur = linkNodeList.remove(0);
                if (i == size - 1){
                    next = null;
                }else
                    next = linkNodeList.get(0);
                cur.next = next;
                if (cur.left != null)
                    linkNodeList.add(cur.left);
                if (cur.right != null)
                    linkNodeList.add(cur.right);
            }
        }
    }*/
    //层序遍历，遍历n层的时候调整n + 1层的next
    public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        TreeLinkNode level_start = root;
        TreeLinkNode cur = null;
        while (level_start != null) {
            cur = level_start;
            while (cur != null) {
                if (cur.left != null) cur.left.next = cur.right;
                if (cur.right != null && cur.next != null) cur.right.next = cur.next.left;
                cur = cur.next;
            }
            level_start = level_start.left;
        }
    }
}
