package n1minimumDepthOfBinaryTree;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3  = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right  = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.right = treeNode5;
        Solution solution = new Solution();
        System.out.println(solution.run(treeNode1));
    }
}
