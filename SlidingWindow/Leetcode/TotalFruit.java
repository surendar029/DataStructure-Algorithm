package SlidingWindow.Leetcode;

import java.util.HashMap;

public class TotalFruit {
    public static void main(String[] args) {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while (map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
