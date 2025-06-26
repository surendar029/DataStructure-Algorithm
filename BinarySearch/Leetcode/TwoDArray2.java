package BinarySearch.Leetcode;

public class TwoDArray2 {
    static boolean isFound(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 20},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        int left = 0;
        int right = matrix.length - 1; 
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (matrix[0][mid] == target) {
                System.out.println(mid);
            } else if (matrix[0][mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
    }
}
