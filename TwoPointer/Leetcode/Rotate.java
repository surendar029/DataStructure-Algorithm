package TwoPointer.Leetcode;

import java.util.Arrays;

public class Rotate {

    static  void rotate(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left++]=nums[right];
            nums[right--]=temp;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        k=k%nums.length;
        rotate(nums,0,nums.length-1);
        rotate(nums,0,k-1);
        rotate(nums,k, nums.length-1);
        Arrays.stream(nums).forEach(System.out::print);
    }
}
