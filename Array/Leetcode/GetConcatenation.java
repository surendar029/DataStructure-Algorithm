package Array.Leetcode;

import java.util.Arrays;

public class GetConcatenation {

    static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < 2 * nums.length; i++) {
            result[i] = nums[i % nums.length];
        }
        return result;
    }

    static int[] getConcatenation1(int[] nums) {
        int[] copy = nums.clone();
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        for (int j = 0; j < copy.length; j++) {
            result[nums.length + j] = copy[j];
        }
        return result;
    }

    static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n * 2];
        System.arraycopy(nums, 0, result, 0, n);
        System.arraycopy(nums, 0, result, n, n);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        Arrays.stream(getConcatenation2(nums)).forEach(System.out::println);

    }
}
