package Array.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    static List<Integer> majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) > nums.length / 3) {
                list.add(num);
            }
        }
        return list;
    }

    static List<Integer> majorElement2(int[] nums) {
        int count1 = 0, count2 = 0;
        int candi1 = 0, candi2 = 1;
        for (int num : nums) {
            if (num == candi1) {
                count1++;
            } else if (num == candi2) {
                count2++;
            } else if (count1 == 0) {
                candi1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candi2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candi1) count1++;
            else if (num == candi2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(candi1);
        if (count2 > n / 3) result.add(candi2);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 5};
        System.out.println(majorElement2(nums));
    }
}
