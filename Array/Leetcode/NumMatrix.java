package Array.Leetcode;

public class NumMatrix {
    private static int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int r = row1; r <= row2; r++) {
            for (int c = col1; c <= col2; c++) {
                sum += matrix[r][c];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NumMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
        NumMatrix.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
        NumMatrix.sumRegion(1, 2, 2, 4);
    }
}
