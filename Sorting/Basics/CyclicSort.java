package Sorting.Basics;

import java.util.Arrays;

public class CyclicSort {

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 4, 2};
        int i=0,len=nums.length;
        while(i<len){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,correct,i);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
