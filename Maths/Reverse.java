package Maths;

public class Reverse {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
    static int reverse(int x){
        int res = 0;
        while (x != 0) {
            int digit=x%10;
            x/=10;
            if(res>Integer.MAX_VALUE/10 || res<Integer.MIN_VALUE/10) return 0;
            res=res*10+digit;
        }
        return res;
    }
}
