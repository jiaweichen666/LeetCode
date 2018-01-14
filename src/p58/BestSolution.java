package p58;

class BestSolution {
    public int lengthOfLastWord(String s) {
        int len = 0, tail = s.length() - 1;//找到最后一个字符所在的下标，包括“ ”
        while (tail >= 0 && s.charAt(tail) == ' ') tail--;//循环找到最后一个非“ ”字符所在下标
        while (tail >= 0 && s.charAt(tail) != ' ') {//循环到遇到反数第一个“ ”位置为止
            len++;
            tail--;
        }
        return len;
    }
}