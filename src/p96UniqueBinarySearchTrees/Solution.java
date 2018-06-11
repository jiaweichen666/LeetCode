package p96UniqueBinarySearchTrees;

/**
 * Description:给定n个节点，请问能生成多少棵不同的BST
 * Tip：设函数g（n）为给定n个节点能生成的BST
 *      f（n，i）为给定n个节点将第i个节点设为root所能生成的BST的数目
 *      由此可见g（n） = f（n,1）+ f（n,2）+ f（n,3）+ f（n,4）+ ... +f（n,n）
 *      欲求f（n,i）,可知在将i作为根节点后，其左子树和右子树也是使用相同的逻辑进行构建
 *      则可得f(n,i) = g(i - 1) * g( n - i)
 *      则可得g（n） = g（0）* g（n - 1）+ g（1）*g（n - 2）+ ... +g(n - 1) * g(0)
 *      g（0） = 1，g（1） = 1
 *      使用DP动态规划可得。
 */
public class Solution {
    public int numTrees(int n) {
        int [] g = new int[n + 1];
        g[0] = 1;
        g[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                g[i] += g[j - 1] * g[i - j];
            }
        }
        return g[n];
    }
}
