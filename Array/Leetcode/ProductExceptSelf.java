package Array.Leetcode;

import java.util.Arrays;

public class ProductExceptSelf {
    static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    static int[] productExceptSelf1(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] sufix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        sufix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            sufix[i] = sufix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefix[i] * sufix[i];
        }
        return nums;
    }

    static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        if (n == 0) return result;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product * nums[i];
            prefix[i] = product;
        }

        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product = product * nums[i];
            suffix[i] = product;
        }

        result[0] = suffix[1];
        result[n - 1] = prefix[n - 2];

        for (int i = 1; i < n - 1; i++) {
            result[i] = prefix[i - 1] * suffix[i + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        Arrays.stream(productExceptSelf2(nums)).forEach(System.out::println);
    }
}
