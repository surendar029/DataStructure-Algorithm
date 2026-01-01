package Backtracking.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        backTrack(candidates, target, 0, result, new ArrayList<>());
        System.out.println(result);
    }

    private static void backTrack(int[] candidates, int target, int pos, List<List<Integer>> result, List<Integer> current) {
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = pos; i < candidates.length; i++) {
            current.add(candidates[i]);
            backTrack(candidates, target - candidates[i],i, result, current);
            current.remove(current.size() - 1);
        }
    }
}
