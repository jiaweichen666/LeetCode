package NSumProblems.TwoSum;

import NSumProblems.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> twoSum(int num[], int sum){
        int p = 0;
        int q = num.length - 1;
        List<List<Integer>> list = new ArrayList<>();
        Sort sort = new Sort();
        num = sort.bubbleSort(num);
        while (p < q){
            if (num[p] + num[q] == sum){
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(num[p]);
                tmp.add(num[q]);
                list.add(tmp);
                System.out.println(num[p]+" + "+num[q]+" = "+sum);
                q--;
            }else if (num[p] + num[q] < sum){
                p++;
            }else {
                q--;
            }

        }
        return list;
    }
    public List<List<Integer>> threeSum(int [] num,int sum) {
        Sort sort = new Sort();
        num = sort.bubbleSort(num);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < num.length - 2; i++) {
            if (i == 0 || (num[i] != num[i - 1])) {//避免i重复
                int p = i + 1;//只许往前找不许往后回头避免重复
                int q = num.length - 1;
                int remainSum = sum - num[i];
                while (p < q) {
                    if (num[p] + num[q] == remainSum) {
                        list.add(Arrays.asList(num[i],num[p],num[q]));
                        System.out.println(num[i] + " + " + num[p] + " + " + num[q] + " = " + sum);
                        while (p < q && num[p] == num[p + 1]) p++;//避免重复元素重复寻找
                        while (p < q && num[q] == num[q - 1]) q--;
                        p++;
                        q--;
                    } else if (num[p] + num[q] > remainSum) {
                        while (p < q && num[q] == num[q - 1]) q--;
                        q--;
                    } else{
                        while (p < q && num[p] == num[p + 1]) p++;//避免重复元素重复寻找
                        p++;
                    }
                }
            }
        }
        return list;
    }
}
