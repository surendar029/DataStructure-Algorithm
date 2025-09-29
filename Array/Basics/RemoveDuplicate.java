package Array.Basics;

import java.util.HashSet;

public class RemoveDuplicate {
    static int removeDuplicate(int[] nums){
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[count]!=nums[i]){
                nums[++count]=nums[i];
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));
    }
}
