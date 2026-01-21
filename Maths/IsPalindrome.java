package Maths;

public class IsPalindrome {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(palindrome(x));
    }

    static boolean palindrome(int x) {
        if (x < 0 || x % 10 == 0 && x!=0) return false; //handle -ve value & random num like 0003440
        int res = 0;
        while (x > res) {
            int digit = x % 10;
            x /= 10;
            res = res * 10 + digit;
        }
        return x == res || x == res / 10;
    }
}
