package p89GrayCode;
/**
 * Description:给定n，返回对应的graycode？？
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>(1<<n);
        for (int i = 0; i < 1<< n; i++) {
            list.add(i ^ i>>1);
        }
        return list;
    }
}
