package Hash.Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        int len= arr.length;
        int[] freq=new int[len+1];
        for(int ar:arr) freq[ar-1]++;
        System.out.println(Arrays.toString(freq));
    }
}
