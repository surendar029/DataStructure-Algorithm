package SlidingWindow.Leetcode;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int left=0,right=0,sum=0;
        int maxWin=Integer.MAX_VALUE;

        while(right< nums.length){
            sum+=nums[right++];
            while(sum>=target){
                int windowSize=right-left;
                maxWin=Math.min(maxWin,windowSize);
                sum-=nums[left++];
            }
        }
        System.out.println(maxWin);
    }
}
