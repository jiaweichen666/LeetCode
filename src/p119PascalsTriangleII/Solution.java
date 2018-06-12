package p119PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;
/**
 * Description:计算帕斯卡三角的第n行
 * Tip：找规律
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0)
            return list;
        list.add(1);
        if (rowIndex == 0)
            return list;
        list.add(1);
        if (rowIndex == 1)
            return list;
        else {
            for (int i = 2; i <= rowIndex; i++) {
            int first = 0;
                for (int j = 0; j < list.size(); j++) {
                    int second = list.remove(0);
                    list.add(first + second);
                    first = second;
                }
                list.add(1);
            }
        }
        return list;
    }
}
