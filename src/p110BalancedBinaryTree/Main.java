package p110BalancedBinaryTree;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        root.left = treeNode2;
        Solution solution = new Solution();
        System.out.println(solution.isBalanced(root));
    }
}
