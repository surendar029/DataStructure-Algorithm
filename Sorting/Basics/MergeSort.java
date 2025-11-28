package Sorting.Basics;

import java.util.Arrays;

public class MergeSort {

    // Recursive Merge Sort
    static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Avoid overflow
            mergeSort(nums, left, mid);          // Sort left half
            mergeSort(nums, mid + 1, right);     // Sort right half
            merge(nums, left, mid, right);       // Merge the two halves
        }
    }

    // Merge two sorted halves: nums[left..mid] and nums[mid+1..right]
    static void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] l1 = new int[n1];
        int[] l2 = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) l1[i] = nums[left + i];
        for (int j = 0; j < n2; j++) l2[j] = nums[mid + 1 + j];

        int i = 0, j = 0, counter = left;

        // Merge two arrays in sorted order
        while (i < n1 && j < n2) {
            if (l1[i] <= l2[j]) {
                nums[counter++] = l1[i++];
            } else {
                nums[counter++] = l2[j++];
            }
        }

        // Copy remaining elements (if any)
        while (i < n1) nums[counter++] = l1[i++];
        while (j < n2) nums[counter++] = l2[j++];
    }

    public static void main(String[] args) {
        int[] nums = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(nums));

        mergeSort(nums, 0, nums.length - 1);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(nums));
    }
}
