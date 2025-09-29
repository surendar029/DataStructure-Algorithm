package SlidingWindow.Leetcode;

public class CharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int strLen = s.length();
        int max=0,maxLen=0,left=0;
        int[] freq=new int[26];
        for (int right = 0; right < strLen; right++) {
            char c=s.charAt(right);
            freq[c-'A']++;
            max=Math.max(max,freq[c-'A']);
            int windowSize=right-left+1;

            if(windowSize-max>k){
                freq[s.charAt(left++)-'A']--;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
}
