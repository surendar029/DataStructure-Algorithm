package Array.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumbers {

    static List<Integer> findDisappearedNumbers(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    static List<Integer> findDisappearedNumbers1(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int index=Math.abs(nums[i])-1;
            nums[index]=-Math.abs(nums[index]);
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={-4,-3,-2,-7,8,2,-3,-1};
        for (int i = 0; i < nums.length; i++) {
            int index=Math.abs(nums[i])-1;
            nums[index]=-Math.abs(nums[index]);
        }
        Arrays.stream(nums).forEach(System.out::println);
//        {3,2,1,6,7,1,2,0}
//         nums[1]=-2
//        -(Math.abs(-2))=-2
    }
}
