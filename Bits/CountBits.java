package Bits;

import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        int n = 6;
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = (i % 2 != 0) ? res[i / 2] + 1 : res[i / 2];
        }
        System.out.println(Arrays.toString(res));

    }
}
