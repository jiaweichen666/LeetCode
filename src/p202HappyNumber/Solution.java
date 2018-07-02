package p202HappyNumber;
import java.util.HashSet;

public class Solution {
    private HashSet<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        if (n <= 0)
            return false;
        while (n != 1) {
            int newn = 0;
            while (n != 0) {
                int tmp = n % 10;
                newn += tmp * tmp;
                n = n / 10;
            }
            n = newn;
            if (!set.add(n))
                return false;
        }
        return true;
    }
}
