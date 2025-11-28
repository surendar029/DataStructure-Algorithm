package Hash.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        Set<Integer> set=new HashSet<>();
        for(int ar:a) set.add(ar);
        for(int br:b) set.add(br);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
