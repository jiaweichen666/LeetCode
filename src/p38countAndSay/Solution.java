package p38countAndSay;

/**
 * Description:报数。
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 1 被读作  "one 1"  ("一个一") , 即 11。
 11 被读作 "two 1s" ("两个一"）, 即 21。
 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 */
class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        if (n == 1)
            return sb.toString();
        for (int i = 0; i < n - 1; i++) {
            String tmp = sb.toString();
            sb.delete(0,sb.length());
            for (int j = 0; j < tmp.length(); j++) {
                int count = 1;
                while (j + 1 < tmp.length() && tmp.charAt(j) == tmp.charAt(j + 1)){
                    count++;
                    j++;
                }
                sb.append(count).append(tmp.charAt(j));
            }
        }
        return sb.toString();
    }
}
