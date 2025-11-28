package Array.Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistance {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(List<Integer> indices:map.values()){
            if(indices.size()<3) continue;
            for (int i = 0; i+2 < indices.size(); i++) {
                int a=indices.get(i);
                int b=indices.get(i+1);
                int c=indices.get(i+2);

                int dist=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a);
                min=Math.min(min,dist);
            }
        }
        for(List<Integer> indices:map.values()){
            System.out.print(indices+" ");
            System.out.println((indices.size()<3) +"->"+indices.size());
        }
    }
}
