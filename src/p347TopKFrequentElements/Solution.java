package p347TopKFrequentElements;

import java.util.*;

/**
 * Description:给定数组，找出数组中出现频次最高的k个数字
 * Tip：采用桶排序的思想，首先遍历一遍数组把每个数字出现的频次存入一个hashmap，之后遍历hashmap，
 * 将出现频次相同的数字放入一个桶内，桶的排序按照出现频次由低到高，之后从最后一个桶开始遍历，把数字加入
 * 越是后面的桶出现的频次越高，直到返回list res装满了k个元素为止。
 */
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (int num:nums) {
            frequency.put(num,frequency.getOrDefault(num,0) + 1);
        }
        for (int key:frequency.keySet()) {
            int tmpfrequency = frequency.get(key);
           if (bucket[tmpfrequency] == null)
               bucket[tmpfrequency] = new ArrayList<>();
            bucket[tmpfrequency].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && res.size() < k ; i--) {
            if (bucket[i] != null)
                res.addAll(bucket[i]);
        }
        return res;
    }
}