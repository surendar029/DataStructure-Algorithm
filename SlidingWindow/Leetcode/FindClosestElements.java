package SlidingWindow.Leetcode;

import java.util.*;

public class FindClosestElements {
    public static void main(String[] args) {
        int[] arr={1,10,15,25,35,45,50,59};
        int k=1,x=30;
        Map<Integer,List<Integer>> map=new TreeMap<>();
        for(int ar:arr){
            int dis=Math.abs(ar-x);
            map.putIfAbsent(dis,new ArrayList<>());
            map.get(dis).add(ar);
        }

        List<Integer> result=new ArrayList<>();
        for(int num: map.keySet()){
            List<Integer> list=map.get(num);
            for(int n:list){
                if (result.size() < k) {
                    result.add(n);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
