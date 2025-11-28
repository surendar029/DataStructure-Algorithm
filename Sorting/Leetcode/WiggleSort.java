package Sorting.Leetcode;

import java.util.Arrays;

public class WiggleSort {
    public static void main(String[] args) {
        int[] nums = {1, 5, 1, 1, 6, 4};
        int len= nums.length;
        int left=(len-1)/2,right= len-1;
        int[] sorted=Arrays.copyOf(nums,len);
        Arrays.sort(sorted);
        for (int i = 0; i < len; i++) {
            nums[i]=(i%2==0) ? sorted[left--] : sorted[right--];
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
