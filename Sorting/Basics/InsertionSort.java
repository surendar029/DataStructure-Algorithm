package Sorting.Basics;

public class InsertionSort {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void print(int[] arr) {
        for (int ar : arr) {
            System.out.print(ar);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 6, 10, 9, 200, 84};
        print(arr);
        sort(arr);
        print(arr);
    }
}
