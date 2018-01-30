package NSumProblems;

public class Sort {
    public int [] bubbleSort(int num[]){
        int flag = 0;
        for (int i = 1;i <= num.length;i++) {
            for (int j = 0; j < num.length - i; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = tmp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
        return num;

    }
}
