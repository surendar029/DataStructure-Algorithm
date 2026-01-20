package Bits;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (n & 1);
            n>>=1;
        }
        System.out.println(res);
    }
}
