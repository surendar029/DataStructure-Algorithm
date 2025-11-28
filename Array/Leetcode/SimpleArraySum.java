package Array.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {
        Integer[] arr={1, 2, 3, 4, 10, 11};
        List<Integer> lists= new ArrayList<>(Arrays.asList(arr));
        int sum=0;
        for(int list:lists){
            sum+=list;
        }
        System.out.println("hello_"+"\n"+" world");
    }
}
