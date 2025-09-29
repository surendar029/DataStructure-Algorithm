package TwoPointer.Leetcode;

import java.util.Arrays;

public class ThreeSumClosest {

    static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int closeSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    int currentDiff = Math.abs(currentSum - target);
                    if (currentDiff < minDiff) {
                        minDiff = currentDiff;
                        closeSum = currentSum;
                    }
                }
            }
        }
        return closeSum;
    }

    static int threeSumClosest1(int[] nums, int target) {
        int len = nums.length;
        int closeSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i <len-2 ; i++) {
            int left=i+1;
            int right=len-1;
            while(left<right){
                int currentSum=nums[i]+nums[left]+nums[right];
                int currentDiff=Math.abs(currentSum-target);
                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    closeSum = currentSum;
                }
                if(currentSum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closeSum;
    }

    static int threeSumClosest2(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=Integer.MAX_VALUE;
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currentSum=nums[i]+nums[left]+nums[right];
                int currentDif=Math.abs(currentSum-target);
                if(currentDif<minDiff){
                    minDiff=currentDif;
                    closestSum=currentSum;
                } else if (currentSum<target) {
                    left++;
                }else{
                    right++;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90}; //{-4,-1,1,2}
        int target = 1;
        System.out.println(threeSumClosest2(nums, target));
    }
}
