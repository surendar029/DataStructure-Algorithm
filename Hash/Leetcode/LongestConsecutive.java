package Hash.Leetcode;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int num:nums) set.add(num);
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int count=0;
                while(set.contains(curr)){
                    curr++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        System.out.println(max);
    }
}
