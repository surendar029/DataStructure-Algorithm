package Array.Basics;

import java.util.PriorityQueue;

public class K_Element {

    static int K_Ele(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int a : arr) {
            queue.add(a);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 2;
        int sum=0;
        for(int a:arr){
            sum^=a;
        }
        System.out.println(sum);
    }
}
