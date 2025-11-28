package Hash.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : nums1) set.add(num);

        for (int num : nums2) {
            if (set.contains(num)) result.add(num);
        }
        int[] resArray = new int[result.size()];
        int index = 0;
        for (int i : result) resArray[index++] = i;
        System.out.println(result);
    }
}
