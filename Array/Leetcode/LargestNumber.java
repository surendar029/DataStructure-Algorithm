package Array.Leetcode;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums={10,2};
        String test="";
        for (int i = nums.length-1; i >=0;i--){
            test+=nums[i];
        }
        System.out.println(test);
    }
}
