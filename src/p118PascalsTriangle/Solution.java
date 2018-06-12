package p118PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:计算帕斯卡三角的前n行
 * Tip：找规律
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        if (numRows <= 0)
            return list;
        else if (numRows == 1){
            tmp.add(1);
            list.add(new ArrayList<>(tmp));
            return list;
        }else if (numRows == 2){
            tmp.add(1);
            list.add(new ArrayList<>(tmp));
            tmp.add(1);
            list.add(new ArrayList<>(tmp));
            return list;
        }else{
            tmp.add(1);
            list.add(new ArrayList<>(tmp));
            tmp.add(1);
            list.add(new ArrayList<>(tmp));
            for (int i = 3; i <= numRows ; i++) {
                int first = 0;
                for (int j = 0; j < tmp.size(); j++) {
                    int second = tmp.remove(0);
                    tmp.add(first + second);
                    first = second;
                }
                tmp.add(1);
                list.add(new ArrayList<>(tmp));
            }
        }
        return list;
    }
}
