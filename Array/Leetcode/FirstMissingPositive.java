package Array.Leetcode;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        int XOR=0;
        for (int i = 1; i <= nums.length; i++) {
            XOR^=i;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) {
                XOR ^= nums[i];
            }
        }
        System.out.println(XOR);
    }
}
