package Maths;

public class MyPow {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        double res=1.0;
        long N = n;  //handle overflow
        if (N < 0) {  // if its -ve value
            x = 1 / x;
            N = -N;
        }
        while (N > 0) {
            if((N&1)==1) res*=x;
            x*=x;
            N>>=1;
        }
    }
}
