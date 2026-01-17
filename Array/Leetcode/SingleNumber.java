package Array.Leetcode;

import java.util.HashMap;

public class SingleNumber {
    static int singleNumber(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1) return nums[i];
        }
        return -1;
    }
    static int singleNumber1(int[] nums){
        int XOR=0;
        for(int num:nums){
            XOR^=num;
        }
        return XOR;
    }
    static int singleNumber2(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)<2){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1};
        System.out.println(singleNumber(nums));
    }
}
