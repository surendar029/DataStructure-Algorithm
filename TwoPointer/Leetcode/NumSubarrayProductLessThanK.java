package TwoPointer.Leetcode;

public class NumSubarrayProductLessThanK {
    static int numSubarrayProductLessThanK(int[] nums,int k){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                if (product < k) count++;
                else break;
            }
        }
        return count;
    }
    static int numSubarrayProductLessThanK1(int[] nums,int k){
        int start = 0, product = 1, count = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= k) {
                product /= nums[start];
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
}
