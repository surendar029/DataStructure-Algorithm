package Greedy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {0, 0, 0, 0, 0, 1, 0, 0};
        int n = 0, len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0) || flowerbed[i - 1] == 0;
                boolean right = (i == len - 1) || flowerbed[i + 1] == 0;

                if (left && right) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) break;
                }
            }
        }
        System.out.println(n);
    }
}


//flowerbed = [0,0,1,0,1] n = 1