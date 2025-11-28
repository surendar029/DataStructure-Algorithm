package Hash.Basics;

import java.util.Arrays;

public class GetSneakyNumbers {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        int[] freq=new int[nums.length];
        int[] res=new int[2];
        int count=0;
        for(int num:nums){
            freq[num]++;
            if(freq[num]>1){
                res[count++]=num;
            }
        }
        Arrays.stream(res).forEach(System.out::println);
    }
}
