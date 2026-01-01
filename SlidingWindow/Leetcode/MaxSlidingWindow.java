package SlidingWindow.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<Integer> result=new ArrayList<>();
        int left=0,right=k-1;
        while(right<nums.length){
            int n=findMax(nums,left,right);
            result.add(n);
            right++;
            left++;
        }
        int[] res=new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i]= result.get(i);
        }
        System.out.println(result);
    }
    static int findMax(int[] nums,int left ,int right){
        int max=0;
        for (int i = left; i <=right; i++) {
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}
