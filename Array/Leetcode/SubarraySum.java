package Array.Leetcode;

import java.util.HashMap;

public class SubarraySum {

    static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int unit = 0;
            for (int j = i; j < nums.length; j++) {
                unit += nums[j];
                if (unit == k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int subarraySum1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, total = 0;
        map.put(0, 1);
        for (int num : nums) {
            total += num;
            if (map.containsKey(total - k)) {
                count += map.get(total - k);
            }
            map.put(total, map.getOrDefault(total, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int k = 3;
        int sum=0,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
