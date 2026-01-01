package Heap;

import java.util.*;

class CloseComparator implements Comparator<Integer>{
    int x;
    public CloseComparator(int x){this.x=x;}
    public int compare(Integer a,Integer b){
        int diff=Math.abs(b-x)-Math.abs(a-x);
        if(diff==0) return b-a;
        return diff;
    }
}
public class FindClosestElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4, x = 3;
        PriorityQueue<Integer> queue=new PriorityQueue<>(new CloseComparator(x));
        for (int num:arr){
            queue.add(num);
            if (queue.size()>k) queue.poll();
        }
        List<Integer> result=new ArrayList<>(queue);
        Collections.sort(result);
        System.out.println(result);
    }
}
