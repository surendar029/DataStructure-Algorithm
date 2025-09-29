package Array.Leetcode;

import java.util.Arrays;

public class MissingNumber {

    static int missingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    static int missingNumber1(int[] nums){
        int actual=0;
        int expected=0;
        for (int i = 0; i <= nums.length; i++) {
            expected+=i;
        }
        for (int num:nums){
            actual+=num;
        }
        return expected-actual;
    }

    static int missingNumber2(int[] nums){
        int XOR=0;
        for (int i = 0; i <= nums.length; i++) {
            XOR^=i;
        }
        for (int num:nums){
            XOR^=num;
        }
        return XOR;
    }
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber2(nums));
    }
}
