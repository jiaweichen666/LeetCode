package p91DecodeWays;

public class IterationSolution {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int f0 = 0;
        int f1 = 1;
        for (int i = chars.length - 2; i >=0 ; i--) {
            int g = 0;
            int flagNum = Integer.valueOf(chars[i]) + Integer.valueOf(chars[i + 1]);
            if (flagNum >= 11 && flagNum <= 26)
                g = 1;
            int tmp = f1;
            f1 = f1 + g * f0;
            f0 = tmp;
        }
        return f1;
    }
}