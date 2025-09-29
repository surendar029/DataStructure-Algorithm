package SlidingWindow.Leetcode;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        int left =0,right=0,zeroCount=0,len=0;
        while(right<nums.length){
            if(nums[right]==0) zeroCount++;
            while(zeroCount>1){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            len=Math.max(len,right-left);
            right++;
        }
        System.out.println(len);
    }
}
