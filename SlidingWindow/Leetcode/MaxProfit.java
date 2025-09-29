package SlidingWindow.Leetcode;

public class MaxProfit {
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        for (int num : prices) {
            minPrice = Math.min(minPrice, num);
            maxPrice = Math.max(maxPrice, num - minPrice);
        }
        return maxPrice;
    }
    public static void main(String[] args) {
        int[] nums = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(nums));
    }
}
