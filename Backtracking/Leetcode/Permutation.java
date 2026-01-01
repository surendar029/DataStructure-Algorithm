package Backtracking.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,result,new boolean[nums.length],new ArrayList<>());
        System.out.println(result);
    }

    private static void backtrack(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> current) {
        if(current.size()== nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            used[i]=true;
            current.add(nums[i]);
            backtrack(nums,result,used,current);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}
//[1,2,3]