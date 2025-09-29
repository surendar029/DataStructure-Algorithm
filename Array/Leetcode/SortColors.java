package Array.Leetcode;

import java.util.Arrays;

public class SortColors {

    static int[] sortColors(int[] nums){
        int c1=0,c2=0,c3=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                c1++;
            } else if (nums[i]==1) {
                c2++;
            }else {
                c3++;
            }
        }
        int index=0;
        while(c1>0) {nums[index++]=0; c1--;};
        while(c2>0) {nums[index++]=1; c2--;};
        while(c3>0) {nums[index++]=2; c3--;};
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};

    }
}
