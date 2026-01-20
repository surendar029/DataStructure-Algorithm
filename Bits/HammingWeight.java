package Bits;

public class HammingWeight {
    public static void main(String[] args) {
        int n = 2147483645;
        System.out.println(Integer.bitCount(n));
        int count=0;
        while(n!=0){
            count+=(n&1);
            n>>=1;
        }
        System.out.println(count);
    }
}
