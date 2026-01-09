package Hash.Basics;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int XOR=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr) freq.put(num,freq.getOrDefault(num,0)+1);
        for(int key:freq.values()){
            if(!set.add(key)) System.out.println(false);
        }
        System.out.println(XOR);
    }
}
