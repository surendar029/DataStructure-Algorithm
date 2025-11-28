package Sorting.Leetcode;

import java.util.Arrays;

public class MoveZeroes {
    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int i=0,len=nums.length;
        while(i<len){
            int correct=nums[i]-1;
            if(correct<len && nums[i]>0 && nums[i]!=nums[correct] ){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
