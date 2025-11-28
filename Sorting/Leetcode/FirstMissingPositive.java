package Sorting.Leetcode;

import java.util.Arrays;

public class FirstMissingPositive {
    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int i=0,len= nums.length;
        while (i<len){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=len && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < len; j++) {
            if(nums[j]!=j+1) System.out.println(j);
        }
        System.out.println(Arrays.toString(nums));
    }
}
