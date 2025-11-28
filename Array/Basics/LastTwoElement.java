package Array.Basics;

import java.util.Arrays;

public class LastTwoElement {
    public static void main(String[] args) {
        int[] nums = {8, 2, 9, 4, 9};
        int[] freq=new int[nums.length+1];
        for(int num:nums){
            freq[num]++;
        }
        Arrays.stream(freq).forEach(System.out::print);
    }
}
