package SlidingWindow.Leetcode;


import java.util.Arrays;

public class CheckInclusion {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i)-'a']++;
            if(i>=s1.length()){
                freq2[s2.charAt(i-s1.length())-'a']--;
            }
            if(Arrays.equals(freq1,freq2)){
                System.out.println(true);
            }
        }
    }
}
