package BinarySearch.Leetcode;

public class KthSmallest {
    static int countLessEqual(int[][] mat, int x) {
        int rowLen= mat.length;
        int row=0,col= mat[0].length-1,count=0;
        while(row<rowLen && col>=0){
            int num= mat[row][col];
            if(num<=x){
                count+=col+1;
                row++;
            }else{
                col--;
            }
        }
        return count;
    }

     static int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length-1,m=matrix[0].length-1;
        int left=matrix[0][0],right=matrix[n][m];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(countLessEqual(matrix,mid)<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };

        int k = 8;
        System.out.println(kthSmallest(matrix,k));

    }
}
