package p46Permutations;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*全排列，最深递归深度4（以1,2,3的全排列为例子）
* 步骤：1进out，2进out，3进out，第四层out进res，res：（1,2,3），第四层1，2,3均被访问过
*      跳回第三层，3出out，第三层for循环结束
*      跳回第二层，2出out，for循环判断3未被访问，3进out，进入第三层，2未被访问，进out，
*      进第四层，res：（1,2,3），（1，3,2）。1,2,3均被访问，跳回第三层，2出out，for循环判断3在out中，for循环结束
*      跳回第二层，3，出0out，i = 3for循环结束，跳回第一层，1出out；
*      i=2，开始第一层的第二个for循环的执行：
*      2进out，进第二层，1进out，进第三层，3进out，进第四层，（2,1,3）进res
*      跳回第三层，3出out，本层for循环结束，跳回第二层，1出out，for循环判断2在out中，3不在，3进out
*      进第三层，1进out，第四层，（2,3,1）进res 跳回第三层，1出out，for循环判断2,3均在out中，
*      跳回第二层。3出out，for循环结束，跳回第一层，2出out。
*      开始第一层for循环的i=3的递归运行：
*      3进out，1进out，2进out，（3,1,2）进res
*      回第三层，2出out，for循环判断3在out中，回第二层，1出out，for循环判断2未被访问，2进out
*      进第三层，1进out，进第四层，（3,2,1）进res
*      回第三层，1出out，for循环判断2,3均被访问，
*      回第二层，2出out，for循环判断3被访问，跳回第一层，
*      3出out，第一层的for循环结束，程序终止。*/
/*
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> out = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        int [] visited = new int[nums.length];
        helper(nums,0,visited,out,res);
        return res;
    }
    public void helper(int[] num,int level,int[] visited,List<Integer> out,List<List<Integer>> res){
        if (level == num.length) {
            //System.out.println("Add to res:"+ out);
            res.add(new LinkedList<>(out));
        }
        for (int i = 0;i < num.length;i++){
            if (visited[i] == 0){
                //System.out.println("Before add:"+out);
                out.add(num[i]);
                visited[i] = 1;
                helper(num,level+1,visited,out,res);
                out.remove(out.size() - 1);
              //  System.out.println("After remove:"+out);
                visited[i] = 0;
            }
        }
    }
}
*/
public class Solution{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<Integer>(),nums);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if (tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list,tempList,nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}