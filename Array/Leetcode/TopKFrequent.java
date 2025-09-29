package Array.Leetcode;

import java.util.*;

public class TopKFrequent {

    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer>[] list = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (list[freq] == null) list[freq] = new ArrayList<>();
            list[freq].add(key);
        }
        int[] result = new int[k];
        int count = 0;
        for (int i = list.length - 1; i > 0 && count < k; i--) {
            if (list[i] != null) {
                for (int key : list[i]) {
                    result[count++] = key;
                }
            }
        }
        return result;
    }

    static int[] topKFrequent1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int[] arr = new int[map.size()];
        int ke = 0;
        for (int key : map.keySet()) {
            arr[ke++] = map.get(key);
        }
        Arrays.sort(arr);
        int[] list = new int[k];
        HashSet<Integer> added = new HashSet<>();
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == arr[i] && !added.contains(entry.getKey())) {
                    list[index++] = entry.getKey();
                    added.add(entry.getKey());
                    if (index == k) break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 2;
        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }
}
