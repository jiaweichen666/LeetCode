package P60PermutationSequence;
/**
 * Description:给定n个从1开始的数和第k个指定值，返回第k个排列的结果
 * Tips：假定n = 4，k = 14；
 * 因为所有的都是从0开始计算的，所以k--=13
 * 1.1 + p(2,3,4) 6个
 *   2 + p(1,3,4) 6个
 *   3 + p(1,2,4) 6个
 *   4 + p(1,2,3) 6个
 *   13/factorial(4 - 1) = 13 / 6 = 2 : 说明在3+p(1,2,4)这个组里面找
 *   更新k = k - 2 * factorial(4 - 1) = 1;
 *   第一个数即为list(2) = 3
 *2. 1 + p(2,4) 2个
 *   2 + p(1,4) 2个
 *   4 + p(1,2) 2个
 *   1/factorial( 4 - 2) = 1 / 2 = 0 :说明在 1 + p(2,4)的组里找
 *   更新k = k - 1 * factorial(4 - 2 ) = 1 - 0 * 1 = 1
 *   第二个数即为list(0) = 1;
 *3. 2 + p(4) 1个
 *   4 + p(2) 1个
 *   1/factorial(4 - 3) = 1 / 1 = 1 :说明在 4 + p(2)的组里找
 *   更新k = k - 1 * factorial(4 - 3) = 1 - 1 * 1 = 0;
 *   第三个数为list(1) = 4
 *4. 2
 *   0 / factorial(4 - 4) = 0 / 1 = 0;
 *   第四个数为list(0) = 2;
 *返回3 + 1 + 4 + 2 = 3142
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        if (n < 0 || k < 0)
            return null;
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n ; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            list.add(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        k--;
        for (int i = 1; i <= n ; i++) {
            int index = k / factorial[n - i];
            stringBuilder.append(list.remove(index));
            k = k - index * factorial[n - i];
        }
        return stringBuilder.toString();
    }
}
