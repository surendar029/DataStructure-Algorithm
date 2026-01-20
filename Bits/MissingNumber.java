package Bits;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n=nums.length;
        int sum=n*(n+1)/2;
        int actualSum= Arrays.stream(nums).sum();
        System.out.println(sum-actualSum);
        System.out.println(missingBit(nums));
    }

    static int missingBit(int[] nums){
        int XORsum=0;
        int XORrange=0;
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            XORsum^=nums[i];
            XORrange^=i;
        }
        XORrange^=n;
        return XORsum^XORrange;
    }
}
