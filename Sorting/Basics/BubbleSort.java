package Sorting.Basics;

public class BubbleSort {

    static void sort(int[] arr) {
        int len=arr.length;
        for (int i = 0; i < len; i++) {
            boolean isSwap=false;
            for (int j = 0; j < len-1; j++) {
                if(arr[j]>arr[j+1]){
                    isSwap=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!isSwap) break;
        }
    }

    static void print(int[] arr) {
        for (int ar : arr) {
            System.out.print(ar);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        print(arr);
        sort(arr);
        print(arr);
    }
}
