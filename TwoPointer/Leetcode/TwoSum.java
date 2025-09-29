package TwoPointer.Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{1, j};
                }
            }
        }
        return new int[]{};
    }

    static int[] twoSum1(int[] nums, int target) {
        int[][] keyValue=new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            keyValue[i][0]=nums[i];
            keyValue[i][1]=i;
        }
        Arrays.sort(keyValue,(a,b)->Integer.compare(a[0],b[0]));
        int left = 0, right = nums.length-1;
        while (left < right) {
            if(keyValue[left][0]+keyValue[right][0]==target){
                return new int[]{keyValue[left][1],keyValue[right][1]};
            }else if(keyValue[left][0]+keyValue[right][0]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }

    static int[] twoSumII(int[] numbers, int target) {
        int left=0;
        int right= numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Arrays.stream(twoSumII(nums,target)).forEach(System.out::println);
    }
}
