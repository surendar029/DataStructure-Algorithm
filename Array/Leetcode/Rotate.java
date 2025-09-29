package Array.Leetcode;

public class Rotate {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int len=matrix.length;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < len; i++) {
            int start=0,end=len-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start++]=matrix[i][end];
                matrix[i][end--]=temp;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
