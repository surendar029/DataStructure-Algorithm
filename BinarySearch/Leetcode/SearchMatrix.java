package BinarySearch.Leetcode;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target=16;
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = (n * m) - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int curr = matrix[mid / 4][mid % 4];
            if(curr==target){
                System.out.println(curr);
                return;
            }else if (curr<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }

    }
}
