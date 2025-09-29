package TwoPointer.Leetcode;

import java.util.Arrays;

public class MoveZeroes {
    static void moveZeroes(int[] nums) {
        int pos=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) nums[pos++]=nums[i];
        }
        while(pos<nums.length){
            nums[pos++]=0;
        }
    }

    static void moveZeroes1(int[] nums) {
        int startTraverse=0;
        int traversePointer=0;
        int end=nums.length-1;
        while(traversePointer<=end){
            if(nums[traversePointer]!=0){
                int temp=nums[startTraverse];
                nums[startTraverse++]=nums[traversePointer];
                nums[traversePointer]=temp;
            }
            traversePointer++;
        }
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};

        Arrays.stream(nums).forEach(System.out::println);
    }
}
