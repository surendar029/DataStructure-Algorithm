package Array.Leetcode;

import java.util.*;

public class FindDuplicates {
    static List<Integer> findDuplicates(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);

        for(int n:map.keySet()){
            if(map.get(n)>1) list.add(n);
        }
        return list;
    }

    static List<Integer> findDuplicates1(int[] nums){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                list.add(Math.abs(nums[i]));
            }else{
                nums[index]=-nums[index];
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates1(nums));
    }
}
