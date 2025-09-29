package Array.Leetcode;

import java.util.HashSet;

public class IsValidSudoku {

    static boolean isValidSudoku(char[][] board){
        int row[]=new int[9];
        int col[]=new int[9];
        int squ[]=new int[9];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if(board[r][c]=='.') continue;

                int val=board[r][c]-'1';
                int grid=(r/3)*3+(c/3);

                if((row[r] & (1<<val))>0||(col[c] & (1<<val))>0||(squ[grid] & (1<<val))>0){
                    return false;
                }
                row[r]|=(1<<val);
                col[c]|=(1<<val);
                squ[grid]|=(1<<val);
            }
        }

        return true;
    }

    static boolean isValidSudoku1(char[][] board){
        HashSet<String> seen=new HashSet<>();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == '.') continue;
                char val=board[r][c];;
                String row=val +"Row at"+r;
                String col=val +"Col at"+c;
                String grid=val+"Grid at"+(r / 3) + "-" + (c / 3);
                if(!seen.add(row) || !seen.add(col) || !seen.add(grid)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku1(board));
    }
}
