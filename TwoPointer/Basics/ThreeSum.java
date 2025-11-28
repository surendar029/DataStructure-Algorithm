package TwoPointer.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static void main(String[] args) {
        int[] nums = {-10, -5, -5, -4, -4, -3, -2, -2, 0, 0, 1, 2, 2, 2, 2, 5, 5};
        System.out.println(threesum(nums));

    }

    private static List<List<Integer>> threesum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i==0 || nums[i]!=nums[i-1]){
                int left = i + 1, right = nums.length - 1, target = -nums[i];
                while (left < right){
                    int currSum=nums[left]+nums[right];
                    if (currSum==target){
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }else if (currSum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
