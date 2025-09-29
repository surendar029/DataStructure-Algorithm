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

    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            leftProduct[i] = product;
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            rightProduct[i] = product;
        }
        result[0]=rightProduct[1];
        result[nums.length-1]=leftProduct[nums.length-2];

        for (int i = 1; i < nums.length-1 ; i++) {
            int left=leftProduct[i-1];
            int right=rightProduct[i+1];
            result[i]=left*right;
        }

        Arrays.stream(result).forEach(System.out::println);
    }
}
