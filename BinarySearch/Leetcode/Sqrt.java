package BinarySearch.Leetcode;

public class Sqrt {

    static int integerSqrt(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return i - 1;
    }

    static long integerSqrt1(int x) {
        int left = 1;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(integerSqrt(n));
        System.out.println(integerSqrt1(n));
    }
}
