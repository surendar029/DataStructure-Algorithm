package Backtracking.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveNQueens {
    public static void main(String[] args) {
        System.out.println("N=3 -> " + solveNQueens(3));
        System.out.println("N=4 -> " + solveNQueens(4));
    }

    private static List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i],'.');
        }
        List<List<String>> result = new ArrayList<>();
        backTrack(board,result,0);
        return result;
    }

    static void backTrack(char[][] board, List<List<String>> result, int row) {
        if (row == board.length) {
            result.add(construct(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isValid(board, row, col, board.length)) {
                board[row][col] = 'Q';
                backTrack(board, result, row + 1);
                board[row][col] = '.';
            }

        }
    }

    static boolean isValid(char[][] board, int row, int col, int n) {
        for (int i = 0; i < n; i++) if (board[i][col] == 'Q') return false;
        int r = row - 1, c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r--;
            c--;
        }
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < n) {
            if (board[r][c] == 'Q') return false;
            r--;
            c++;
        }
        return true;
    }

    static List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
}
