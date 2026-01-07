package Comparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};
        Integer[] ar= {5, 2, 9, 1};
        Arrays.sort(ar, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(a>b) return 1;
                else if(a<b) return -1;
                return 0;
            }
        });

        System.out.println(Arrays.toString(ar));
    }
}
