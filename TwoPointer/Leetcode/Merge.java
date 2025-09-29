package TwoPointer.Leetcode;

import java.util.Arrays;

public class Merge {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m; i < n - 1; i++) {
            nums1[j++] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int len = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[len--] = nums1[p1--];
            } else {
                nums1[len--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge1(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
