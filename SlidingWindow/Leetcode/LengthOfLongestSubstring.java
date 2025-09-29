package SlidingWindow.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        Set<Character> seen=new HashSet<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for (int right = 0; right < s.length(); right++) {
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left++));
            }
            seen.add(s.charAt(right));
            max=Math.max(max,seen.size());
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for (int right = 0; right < s.length(); right++) {
            if(map.containsKey(right)){
                left=Math.max(left, map.get(s.charAt(right)));
            }
            map.put(s.charAt(right),right);
            max=Math.max(max,right-left+1);
        }
    }
}
