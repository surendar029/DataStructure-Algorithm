package Sorting.Basics;

public class SelectionSort {

    static void sort(int[] arr) {
        int len=arr.length;
        for (int i = 0; i < len-1; i++) {
            int minIndex=i;
            for (int j = i+1; j <len ; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    static void print(int[] arr) {
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        sort(arr);
        print(arr);
    }
}
