package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:nums) queue.add(num);
        int res=0;
        while(k-->0){
            res= queue.poll();
        }
        System.out.println(res);
    }
}
