package NSumProblems.TwoSum;

import NSumProblems.Sort;
import java.util.*;

public class Solution {
    public List<List<Integer>> twoSum(int num[], int sum) {
        int p = 0;
        int q = num.length - 1;
        List<List<Integer>> list = new ArrayList<>();
        Sort sort = new Sort();
        num = sort.bubbleSort(num);
        while (p < q) {
            if (num[p] + num[q] == sum) {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(num[p]);
                tmp.add(num[q]);
                list.add(tmp);
                System.out.println(num[p] + " + " + num[q] + " = " + sum);
                q--;
            } else if (num[p] + num[q] < sum) {
                p++;
            } else {
                q--;
            }

        }
        return list;
    }

    public List<List<Integer>> threeSum(int[] num, int sum) {
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
                        list.add(Arrays.asList(num[i], num[p], num[q]));
                        System.out.println(num[i] + " + " + num[p] + " + " + num[q] + " = " + sum);
                        while (p < q && num[p] == num[p + 1]) p++;//避免重复元素重复寻找
                        while (p < q && num[q] == num[q - 1]) q--;
                        p++;
                        q--;
                    } else if (num[p] + num[q] > remainSum) {
                        while (p < q && num[q] == num[q - 1]) q--;
                        q--;
                    } else {
                        while (p < q && num[p] == num[p + 1]) p++;//避免重复元素重复寻找
                        p++;
                    }
                }
            }
        }
        return list;
    }

    public int threeSumClosest(int[] nums, int target) {
        //其实和3sum问题一样，需要保存一
        // 个跟target值绝对值最接近的sum值，在遍历的过程中
        //如果碰到了正好相等的立即返回，如果碰到了差的绝对值更小的值，则更新sum
        if (nums.length <= 3){
            int sum = 0;
            for (int tmp:nums) {
                sum += tmp;
            }
            System.out.println(sum);
            return sum;
        }
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0;i <= nums.length-3;i++){
            int remainSum = target - nums[i];
            int p = i + 1;
            int q = nums.length - 1;
            while(p < q){
                if (nums[p] + nums[q] == remainSum){
                    closestSum = target;
                    break;
                }else if (nums[p] + nums[q] < remainSum){
                    int close = nums[p] + nums[q];
                    if (Math.abs(target - (close + nums[i])) < Math.abs(target - closestSum) )
                        closestSum = nums[i] + close;
                    while (nums[p+1] == nums[p]) p++;
                    p++;
                }else {
                    int close = nums[p] + nums[q];
                    if (Math.abs(target - (close + nums[i])) < Math.abs(target - closestSum) )
                        closestSum = nums[i] + close;
                    while(nums[q - 1] == nums[q] ) q--;
                    q--;
                }
            }
        }
        System.out.println(closestSum);
        return closestSum;

    }
    public List<List<Integer>> fourSum1(int[] nums, int target) {//这个我无法解决单个元素被重复使用的问题。。。。
        List<List<Integer>> list = new ArrayList<>();
        Map<List<Integer>,Integer> map = new HashMap<>();
        if (nums.length < 4)
            return list;
        Arrays.sort(nums);
        for (int i = 0;i <= nums.length-2;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (!map.containsKey(Arrays.asList(nums[i], nums[j]))) {
                    map.put(Arrays.asList(nums[i], nums[j]), nums[i] + nums[j]);
                }
            }
        }
        Iterator<Map.Entry<List<Integer>,Integer>> iterator1 = map.entrySet().iterator();
        while(iterator1.hasNext()){
            Map.Entry<List<Integer>,Integer> entry = iterator1.next();
            int value = entry.getValue();
            List<Integer> tmp = entry.getKey();
            System.out.println(value);
            iterator1.remove();
            Iterator<Map.Entry<List<Integer>,Integer>> iterator2 = map.entrySet().iterator();
            while(iterator2.hasNext()){
                Map.Entry <List<Integer>,Integer> entry2 = iterator2.next();
                if (value + entry2.getValue() == target && entry2.getKey() != tmp){
                    List<Integer> list1 = entry.getKey();
                    //System.out.println(list1);
                    List<Integer> list2 = entry2.getKey();
                    //System.out.println(list2);
                    ArrayList<Integer> arrayList = new ArrayList<>(4);
                    arrayList.addAll(list1);
                    arrayList.addAll(list2);
                    Collections.sort(arrayList);
                    if (!list.contains(arrayList))
                      list.add(arrayList);
                }
            }
        }
        System.out.println(list);
        return list;
    }
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        int remainSum1 = 0;
        if (len < 4) return list;
        if (len == 4){
            if (nums[0] + nums[1] + nums[2] + nums[3] == target){
                list.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
            }
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0;i < len;i++){
            remainSum1 = target - nums[i];
            for (int j = i+1;j <= len-3;j++){
                int remainSum2 = remainSum1 - nums[j];
                int p = j+1;
                int q = len - 1;
                while(p < q){
                    if (nums[p] + nums[q] == remainSum2 && p!= i && q!= i && j!=i &&!list.contains(Arrays.asList(nums[i],nums[j],nums[p],nums[q]))){
                        //这个判重条件我真的是写的太挫了。。。有时间想想能不能改进一下。。。
                        list.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                        while(p < q && nums[p] == nums[p+1]) p++;
                        p++;
                        while(p < q && nums[q] == nums[q-1]) q--;
                        q--;
                        System.out.println("P="+p);
                        System.out.println("Q="+q);
                    } else if (nums[p] + nums[q] < remainSum2){
                        while(p < q && nums[p] == nums[p+1]) p++;
                        p++;
                    }else {
                        while(p < q && nums[q] == nums[q-1]) q--;
                        q--;
                    }
                }
            }
        }
        System.out.println(list);
        return list;
    }
}