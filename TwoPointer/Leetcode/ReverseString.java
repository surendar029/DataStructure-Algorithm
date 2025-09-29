package TwoPointer.Leetcode;


import java.util.Arrays;

public class ReverseString {

    static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'h', 'e', 'l', 'l', 'o' };
        reverseString(charArray);
        System.out.println(charArray);
    }
}