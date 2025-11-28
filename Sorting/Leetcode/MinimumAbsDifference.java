package Sorting.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 10, 15};
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int currmin = arr[i] - arr[i - 1];
            System.out.println(currmin);
            if (currmin < min) {
                min = currmin;
            }
            if (currmin == min) {
                list.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        System.out.println(list);
        }
}
