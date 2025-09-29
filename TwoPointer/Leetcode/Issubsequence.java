package TwoPointer.Leetcode;

public class Issubsequence {
    static boolean issubsequence(String s,String t){
        char[] st = s.toCharArray();
        char[] ts = t.toCharArray();
        int sLen = s.length();
        int tLen = t.length();
        int i = 0, j = 0;
        while (i < sLen && j < tLen) {
            if(st[i]==ts[j]) {
                i++;
            }
            j++;
        }
        return sLen==i;
    }
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        System.out.println(issubsequence(s,t));
    }
}
