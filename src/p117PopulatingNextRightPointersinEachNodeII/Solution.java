package p117PopulatingNextRightPointersinEachNodeII;

/**
 * Description:给定不完全的二叉树，将节点的next指针设为它右边的节点，若不存在右边的节点则next为null
 * Tip：层序遍历，遍历第n层的时候调整第n+1层的指针，调整左子树的next指针，右子树的next指针和layer_first指针时，
 * 都要找到再其右边的第一个节点，若右边的节点都为null，则设为null
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        TreeLinkNode layer_first = root;
        while (layer_first != null){
            TreeLinkNode cur = layer_first;
            while (cur != null) {
                if (cur.left != null && cur.right != null) cur.left.next = cur.right;
                else if (cur.left != null && cur.right == null) {
                    TreeLinkNode p = cur.next;
                    while (p != null && p.left == null && p.right == null) {
                        p = p.next;
                    }
                    if (p == null)
                        cur.left.next = null;
                    else if (p.left != null)
                        cur.left.next = p.left;
                    else if(p.right != null)
                        cur.left.next = p.right;
                }
                if (cur.right != null) {
                    TreeLinkNode p = cur.next;
                    while (p != null && p.left == null && p.right == null) {
                        p = p.next;
                    }
                    if (p == null)
                        cur.right.next = null;
                    else if (p.left != null)
                        cur.right.next = p.left;
                    else if(p.right != null)
                        cur.right.next = p.right;
                }
                cur = cur.next;
            }
            if (layer_first.left != null)
                layer_first = layer_first.left;
            else if (layer_first.right != null)
                layer_first = layer_first.right;
            else {
                TreeLinkNode p = layer_first.next;
                while (p != null && p.left == null && p.right == null){
                    p = p.next;
                }
                if (p == null)
                    layer_first = null;
                else if (p.left != null)
                    layer_first = p.left;
                else if (p.right != null)
                    layer_first = p.right;
            }
        }
    }
}
