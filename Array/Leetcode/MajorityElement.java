package Array.Leetcode;

import java.util.HashMap;

public class MajorityElement {
    static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    static int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

    static int majorityElement2(int[] nums) {
        int count = 0;
        int candi = 0;
        for (int num : nums) {
            if (count == 0) {
                candi = num;
            }
            count += (candi == num) ? 1 : -1;
        }
        return (count > nums.length / 2) ? candi : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 5, 6, 5, 7, 1, 1, 1};
        System.out.println(2%5);
    }
}
