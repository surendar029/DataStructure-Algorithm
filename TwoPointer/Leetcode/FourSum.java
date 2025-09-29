package TwoPointer.Leetcode;

import java.util.*;

public class FourSum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(list);
                            set.add(list);
                        }
                    }
                }
            }
        }
        return set.stream().toList();
    }

    static List<List<Integer>> fourSum1(int[] nums, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        for (int i = 0; i < len-3; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for (int j = i+1; j < len-2; j++) {
                if (j>i+1 && nums[j]==nums[j-1]) continue;
                int left=j+1;
                int right=len-1;
                while(left<right){
                    long sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    } else if (sum<target) {
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum1(nums,0));

    }
}
