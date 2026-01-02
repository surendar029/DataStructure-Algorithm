package BinarySearch.Leetcode;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        int left = 1;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;

            // Count numbers <= mid
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right = mid;      // duplicate in left half
            } else {
                left = mid + 1;   // duplicate in right half
            }
        }

        System.out.println("Duplicate number: " + left);
    }
}
