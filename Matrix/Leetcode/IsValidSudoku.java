package Matrix.Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','7','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        HashSet<String> set=new HashSet<>();

        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                    String row=board[i][j]+"row"+i;
                    String col=board[i][j]+"col"+j;
                    String box=board[i][j]+"box"+(i/3)+"and"+(j/3);

                    if(!set.add(row) || !set.add(col) || !set.add(box)){
                        System.out.println(false);
                    }
                }
            }
        }
    }
}
