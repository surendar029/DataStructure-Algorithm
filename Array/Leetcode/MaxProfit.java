package Array.Leetcode;

public class MaxProfit {
    static int maxProfit(int[] nums){
        int max=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<nums[i]){
                max+=nums[i]-nums[i-1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
