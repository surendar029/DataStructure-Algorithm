package SlidingWindow.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> result=new ArrayList<>();
        int[] pFreq=new int[26];
        int[] sFreq=new int[26];
        int left=0,right=0;
        while(right<p.length()){
            pFreq[p.charAt(right)-'a']++;
            sFreq[s.charAt(right)-'a']++;
            right++;
        }
        right--;
        while(right<s.length()) {
            if (Arrays.equals(sFreq, pFreq)) {
                result.add(left);
            }
            right++;
            if (right != s.length()) {
                sFreq[s.charAt(right) - 'a']++;
            }
            sFreq[s.charAt(left) - 'a']--;
            left++;
        }
        System.out.println(result);
    }
}
