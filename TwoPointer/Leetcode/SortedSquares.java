package TwoPointer.Leetcode;

import java.util.Arrays;

public class SortedSquares {

    static int[] sortedSquares(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={4,-1,0,10,3};
        int[] result=new int[nums.length];
        int left=0,right=nums.length-1;
        int pos= nums.length-1;
        while(left<right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[pos--]=nums[left]*nums[left++];
            }else{
                result[pos--]=nums[right]*nums[right--];
            }
        }
        Arrays.stream(result).forEach(System.out::println );
    }
}
