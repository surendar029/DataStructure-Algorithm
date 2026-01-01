package Backtracking.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, result, 0, new ArrayList<>());
        System.out.println(result);

    }
    static void backTrack(int[] nums,List<List<Integer>> result,int index,List<Integer> current){
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backTrack(nums, result, i+1, current);
            current.remove(current.size()-1);
        }
    }
}
