package Array.Leetcode;

import java.util.Arrays;

public class SortArray {

    //bubble
    static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    //selection
    static int[] sortArray1(int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                min = i;
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    //merge
    static int[] sort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = sort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] joined = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                joined[k++] = left[i++];
            } else {
                joined[k++] = right[j++];
            }
        }
        while (i < left.length) joined[k++] = left[i++];
        while (j < right.length) joined[k++] = right[j++];

        return joined;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        Arrays.stream(sort(nums)).forEach(System.out::print);
    }
}
