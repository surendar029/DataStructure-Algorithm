package Array.Leetcode;


import java.util.Arrays;

public class MoveZeroes {
    static void moveZeroes(int[] nums) {
        int[] temp=new int[nums.length];
        int nonZero=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                temp[nonZero++]=nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=temp[i];
        }
    }
    static void moveZeroes1(int[] nums) {
        int nonZero=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[nonZero++]=nums[i];
            }
        }
        while(nonZero<nums.length){
            nums[nonZero++]=0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
