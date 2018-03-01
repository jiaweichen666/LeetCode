package p77Combinations;
import java.util.LinkedList;
import java.util.List;

class Solution {  //Time limited
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> out = new LinkedList<>();
        helper(n,k,1,res,out);
        return res;

    }
    public  void helper(int n,int k,int level,List<List<Integer>> res,List<Integer> out){
        if (out.size() == k){
            res.add(new LinkedList<>(out));
        }
        for (int i = level;i <= n;i++ ){
            if (out.size() < k) {
                out.add(i);
                System.out.println(out);
                helper(n, k, i + 1, res, out);
                out.remove(out.size()-1);
            }
        }
    }
}