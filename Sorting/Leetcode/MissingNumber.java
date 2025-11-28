package Sorting.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        int i = 0, result = 0, len = nums.length;
        List<Integer> list = new ArrayList<>();
        while (i < len) {
            int correct = nums[i];
            if (correct < len && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < len; j++) {
            if (nums[j] != j) result = j;
        }
        result = (result == 0) ? len : result;
        System.out.println(result);
    }
}
