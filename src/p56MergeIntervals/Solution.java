package p56MergeIntervals;
/**
 * Description:合并有重合的区间
 * Tips：先以start值对所有区间排序，再执行类似插入排序的工作
 * 时间复杂度（nlogn）
 */

import java.util.*;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
      intervals.sort(new Comparator<Interval>() {
          @Override
          public int compare(Interval o1, Interval o2) {
              return o1.start - o2.start;
          }
      });
      List<Interval> mergedInterval = new LinkedList<>();
        for (Interval tmp:intervals
             ) {
            if (mergedInterval.isEmpty() || mergedInterval.get(mergedInterval.size() - 1).end < tmp.start)
                mergedInterval.add(tmp);
            else {
                Interval lastInList = mergedInterval.remove(mergedInterval.size() - 1);
                int start = lastInList.start;
                int end = 0;
                if (tmp.end <= lastInList.end){
                    end = lastInList.end;
                }else{
                    end = tmp.end;
                }
                Interval newInterval = new Interval(start,end);
                mergedInterval.add(newInterval);
            }
        }
        return mergedInterval;
    }
}
