package p129SumRoottoLeafNumbers;

public class Main {
    public static void main(String[] args) {
    TreeNode treeNode4 = new TreeNode(4);
    TreeNode treeNode9 = new TreeNode(9);
    TreeNode treeNode0 = new TreeNode(0);
    TreeNode treeNode5 = new TreeNode(5);
    TreeNode treeNode1 = new TreeNode(1);
    treeNode4.left = treeNode9;
    treeNode4.right = treeNode0;
    treeNode9.left = treeNode5;
    treeNode9.right = treeNode1;
    Solution solution = new Solution();
        System.out.println(solution.sumNumbers(treeNode4));
    }

}
