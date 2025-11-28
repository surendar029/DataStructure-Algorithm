package Queue.Leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[]  nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int n= nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                result[i-k+1]=nums[dq.peekFirst()];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
