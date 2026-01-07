package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0],b[0]);
            }
        });
        List<int[]> result=new ArrayList<>();
        int start=intervals[0][0];  //15
        int end=intervals[0][1];    //18
        for (int[] interval:intervals){
            if(interval[0]<=end){  // 15<=10
                end=Math.max(interval[1],end);
            }else{
                result.add(new int[]{start,end});
                start=interval[0];
                end=interval[1];
            }
        }
        result.add(new int[]{start,end});
        int[][] arr=result.toArray(new int[0][]);
        for (int[] ar:arr){
            System.out.println(Arrays.toString(ar));
        }
    }
}
