package p101SymmetricTree;
public class Main {//依次输出前序中序后序遍历二叉树结果，依次输出不带递归的遍历结果，最后判断是否为对称二叉树
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
        System.out.println("PreOrder:");
        solution.PreOrdertraversal(root);
        System.out.println();
        System.out.println("Inorder:");
        solution.InOrdertraversal(root);
        System.out.println();
        System.out.println("SubOrder:");
        solution.SubOrdertraversal(root);
        System.out.println();
        System.out.println("PreOrder without recursive:");
        solution.PreOrderWithoutRecursive(root);
        System.out.println();
        System.out.println("InOrder without recursive:");
        solution.InOrderWithoutRecursive(root);
        System.out.println();
        System.out.println("SubOrder without recursive:");
        solution.SubOrderWithoutRecursive(root);
        System.out.println();
        System.out.println("Is Symmetric?");
        System.out.println(solution.isSymmetric(root));
    }
}
