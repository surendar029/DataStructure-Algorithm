package SlidingWindow.Leetcode;

public class ZeroFilledSubarray {

    static long zeroFilledSubarray(int[] nums) {
        long count = 0, streak = 0;
        for (int num : nums) {
            streak = (num == 0) ? streak + 1 : 0;
            count += streak;
        }
        return count;
    }

    static long zeroFilledSubarray1(int[] nums) {
        long count = 0;
        int left=0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right]==0){
                count+=(right-left+1);
            }else{
                left=right+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 0, 0, 2};
        System.out.println(zeroFilledSubarray1(nums));
    }
}
