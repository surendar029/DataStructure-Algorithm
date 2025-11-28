package Matrix.Leetcode;

public class NumMagicSquaresInside {
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}};

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagic(grid, i, j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static boolean isMagic(int[][] grid, int row, int col) {
        boolean[] seen = new boolean[10];

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                int val = grid[i][j];
                if (val < 1 || val > 9 || seen[val]) {
                    return false;
                }
                seen[val] = true;
            }
        }

        int sum = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];

        for (int i = 0; i < 3; i++) {
            int rowSum = grid[row + i][col] + grid[row + i][col + 1] + grid[row + i][col + 2];
            int colSum = grid[row][col + i] + grid[row + 1][col + i] + grid[row + 2][col + i];
            if (rowSum != sum || colSum != sum) {
                return false;
            }
        }

        int dia1 = grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2];
        int dia2 = grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col];

        if (dia1 != sum || dia2 != sum) {
            return false;
        }

        return true;
    }
}
