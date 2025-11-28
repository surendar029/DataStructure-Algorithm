package Sorting.Leetcode;

import java.util.Arrays;

public class SortColors {
    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int left = 0, mid = 0, right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(nums, mid, right--);   // push 2 to right
            } else if (nums[mid] == 0) {
                swap(nums, left++, mid++);  // bring 0 to left
            } else {
                mid++;                      // nums[mid] == 1 → just move
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
