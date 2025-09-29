package TwoPointer.Leetcode;

import java.util.Arrays;

public class SortColors {
    static int[] sortColors(int[] nums) {
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                c1++;
            } else if (nums[i] == 1) {
                c2++;
            } else {
                c3++;
            }
        }
        int index = 0;
        while (c1 > 0) {
            nums[index++] = 0;
            c1--;
        }
        while (c2 > 0) {
            nums[index++] = 1;
            c2--;
        }
        while (c3 > 0) {
            nums[index++] = 2;
            c3--;
        }
        return nums;
    }

    static int[] sortColors1(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[left];
                nums[left++] =nums[mid];
                nums[mid++]=temp;
            } else if (nums[mid] == 1) {
                mid++;
            }else{
                int temp=nums[right];
                nums[right--]=nums[mid];
                nums[mid]=temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        Arrays.stream(nums).forEach(System.out::println);
    }
}
