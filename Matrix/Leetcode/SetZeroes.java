package Matrix.Leetcode;

import java.util.HashSet;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        int n = matrix.length, m = matrix[0].length;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int r : row) {
            for (int i = 0; i < m; i++) {
                matrix[r][i] = 0;
            }
        }
        for (int c : col) {
            for (int i = 0; i < n; i++) {
                matrix[i][c] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
