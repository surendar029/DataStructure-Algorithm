package Recursion.Leetcode;

public class NumberZero {

    static int numberZero(int n){
        return count(n,0);
    }

    static int count(int n,int c){
        if(n==0) return c;

        if(n%2==0) return count(n/2,c+1);
        return count(n-1,c+1);
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(numberZero(n));

    }
}
