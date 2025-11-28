package Sorting.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int i=0,len=nums.length;
        List<Integer> list=new ArrayList<>();
        while(i<len){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct] && nums[i] <= len){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < len; j++) {
            if(nums[j]!=j+1) list.add(nums[j]);
        }
        System.out.println(list);
    }
}
