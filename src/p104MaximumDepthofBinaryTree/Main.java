package p104MaximumDepthofBinaryTree;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(3);
        TreeNode root = new TreeNode(0);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;
        root.left = treeNode1;
        root.right = treeNode4;
        System.out.println(solution.maxDepth(root));
    }
}
