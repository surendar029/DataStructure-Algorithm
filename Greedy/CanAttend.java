package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class CanAttend {
    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {10, 15}, {3 , 10}};
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<arr[i-1][1]) System.out.println(false);
        }
    }
}
