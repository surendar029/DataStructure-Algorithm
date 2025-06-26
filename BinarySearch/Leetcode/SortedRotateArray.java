package BinarySearch.Leetcode;

import java.util.HashSet;

public class SortedRotateArray {

    static int minElement(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]!=nums[mid+1]){
                right=mid;
            }else{
                left=mid+2;
            }
        }
        return nums[left];
    }

    static int minElem(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,4,8};
        int mid=6+(nums.length-1-6)/2;
        System.out.println(mid+"->"+(mid+2));
        System.out.println(minElement(nums));
    }
}
