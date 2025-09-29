package SlidingWindow.Leetcode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (map.containsKey(val) && i - map.get(val) <= k) {
                return true;
            }
            map.put(val, i);
        }
        return false;
    }

    static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate1(nums, k));
        System.out.println(Integer.MAX_VALUE);
    }
}
