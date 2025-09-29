package Array.Leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    static boolean containsDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                    if(nums[i]==nums[j]){
                        return true;
                    }
            }
        }
        return false;
    }
    static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> set=new HashSet<>(nums.length * 2);
        for(int num:nums){
            if(!set.add(num)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate1(nums));
    }
}
