package Recursion.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsum {

    public static void main(String[] args) {
        int[] set = {32, 3, 4, 5, 7, 9};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        backTrap(set, target, 0, result, new ArrayList<>());
        System.out.println(result);
    }

        private static void backTrap(int[] set, int target, int i, List<List<Integer>> result, List<Integer> current) {
            if (target < 0) return;
            if (target == 0) {
                result.add(new ArrayList<>(current));
                return;
            }
            for (int j = i; j < set.length; j++) {
                if (set[j] > target) continue;
                current.add(set[j]);
                backTrap(set, target - set[j], j + 1, result, current);
                current.remove(current.size() - 1);
            }
    }
}
