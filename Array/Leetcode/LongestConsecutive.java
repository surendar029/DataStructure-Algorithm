package Array.Leetcode;

import java.util.HashSet;

public class LongestConsecutive {
    static int longestConsecutive(int[] nums){
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            int curr=nums[i];
            int count=1;
            while(contains(nums,curr+1)){
                curr++;
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }

    private static boolean contains(int[] nums, int i) {
        for(int num:nums){
            if(i==num) return true;
        }
        return false;
    }

    static int longestConsecutive1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int max = 0;
        for (int num:set) {
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive1(nums));
    }
}
