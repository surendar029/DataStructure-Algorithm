package SlidingWindow.Leetcode;

import java.util.HashMap;

public class MinLength {
    public static int minLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, sum = 0, len = nums.length, min = Integer.MAX_VALUE;
        for (int right = 0; right < len; right++) {
            int rightval = nums[right];
            if (map.getOrDefault(rightval, 0) == 0) sum += rightval;
            map.put(rightval, map.getOrDefault(rightval, 0) + 1);

            while (sum >= k) {
                min = Math.min(min, right - left + 1);
                int leftval = nums[left];
                map.put(leftval, map.get(leftval) - 1);
                if(map.getOrDefault(leftval, 0) == 0) sum -= leftval;
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        int[]  nums = {2, 2, 3, 1};
        int k = 4;
        System.out.println(minLength(nums, k));
    }
}
