package Matrix.Leetcode;

import java.util.HashSet;

public class CountUnguarded {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        int[][] guards = {{0, 0}, {1, 1}, {2, 3}};
        int[][] walls = {{0, 1}, {2, 2}, {1, 4}};

        int[][] grid=new int[m][n];

        for(int[] g:guards){
            grid[g[0]][g[1]]=1;
        }
        for (int[] w:walls){
            grid[w[0]][w[1]]=2;
        }

        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r:row){
            for (int i = 0; i < grid[0].length; i++) {
                if(grid[r][i]==2){
                    break;
                } else if (grid[r][i]==1) {
                    continue;
                } else{
                    grid[r][i]=8;
                }
            }
        }
        for (int c:col){
            for (int i = 0; i < grid.length; i++) {
                if(grid[c][i]==2){
                    break;
                } else if (grid[c][i]==1) {
                    continue;
                } else{
                    grid[c][i]=8;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
