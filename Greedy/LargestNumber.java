package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String[] strs=new String[nums.length];
        for(int i=0;i<nums.length;i++) strs[i]=String.valueOf(nums[i]);
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1=a+b;
                String order2=b+a;
                return order2.compareTo(order1);
            }
        });
        StringBuilder str=new StringBuilder();
        for(String st:strs){
            str.append(st);
        }
        System.out.println(str.toString());

   }
}
