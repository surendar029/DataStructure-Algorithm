package Array.Leetcode;

import java.util.Arrays;

public class Construct2DArray {
    static int[][] construct2DArray(int[] nums, int n, int m) {
        int[][] result = new int[m][n];
        for (int i = 0; i < nums.length; i++) {
            result[i/n][i%n]=nums[i];
        }
        return result;
    }
    static int[][] construct2DArray1(int[] nums, int n, int m) {
        int[][] test = new int[m][n];
        int nk = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                test[i][j] = nums[nk++];
            }
        }
        return test;
    }
    static int[][] construct2DArray2(int[] nums, int n, int m) {
        if(m*n!=nums.length) return new int[0][0];
        int[][] test = new int[m][n];

        for (int i = 0; i < m; i++) {
            test[i]=Arrays.copyOfRange(nums,n*i,n*i+n);
        }
        return test;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Arrays.stream(construct2DArray1(nums,2,2)).map(row->Arrays.toString(row)).forEach(System.out::println);
    }
}
