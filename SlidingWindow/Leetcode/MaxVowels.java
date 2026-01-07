package SlidingWindow.Leetcode;

import java.util.Set;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int count=0,max=0;
        Set<Character> set = Set.of('a','e','i','u','o');
        for (int i = 0; i < k; i++) {
            if(set.contains(s.charAt(i))) count++;
        }
        max=count;
        for (int i = k; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) count++;
            if(set.contains(s.charAt(i-k))) count--;
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}
