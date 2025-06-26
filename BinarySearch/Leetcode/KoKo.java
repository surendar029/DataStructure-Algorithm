package BinarySearch.Leetcode;

import java.util.Arrays;

public class KoKo {

    static boolean Hour(int[] arr, int mid, int h) {
        int sum = Arrays.stream(arr)
                .map(a -> (int) Math.ceil((double) a / mid))
                .sum();

        return sum <= h;
    }

    static int KoKoBana(int[] arr, int h) {
        int left = 0;
        int right = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (Hour(arr, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int h = 8;
        int sum=Arrays.stream(arr).map(a-> a/2).sum();
        System.out.println(sum);
    }
}
