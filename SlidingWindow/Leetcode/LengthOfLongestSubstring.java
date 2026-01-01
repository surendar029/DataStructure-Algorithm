package SlidingWindow.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left++));
            }
            seen.add(s.charAt(right));
            max = Math.max(max, seen.size());
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        Set<Character> seen = new HashSet<>();
        int start = 0, end = 0, max = 0;
        while (end < s.length()) {
            if (!seen.contains(s.charAt(end))) {
                seen.add(s.charAt(end));
                max = Math.max(max, seen.size());
                end++;
            } else {
                seen.remove(s.charAt(start));
                start++;
            }
        }
    }
}
