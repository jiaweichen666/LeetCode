package p117PopulatingNextRightPointersinEachNodeII;

public class Main {
    public static void main(String[] args) {
        TreeLinkNode node1 = new TreeLinkNode(-1);
        TreeLinkNode node2 = new TreeLinkNode(-7);
        TreeLinkNode node3 = new TreeLinkNode(9);
        TreeLinkNode node4 = new TreeLinkNode(-1);
        TreeLinkNode node5 = new TreeLinkNode(-7);
        TreeLinkNode node6 = new TreeLinkNode(8);
        TreeLinkNode node7 = new TreeLinkNode(-9);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        node4.right = node6;
        node5.left = node7;
        Solution solution = new Solution();
        solution.connect(node1);
    }
}
