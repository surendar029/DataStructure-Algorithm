package TwoPointer.Leetcode;

public class MergeAlternately {

    static String mergeAlternately(String word1,String word2){
        int max=Math.max(word1.length(),word2.length());
        StringBuilder std=new StringBuilder();
        for (int i = 0; i < max; i++) {
            if(i<word1.length()){
                std.append(word1.charAt(i));
            }
            if(i<word2.length()){
                std.append(word2.charAt(i));
            }
        }
        return std.toString();
    }

    static String mergeAlternately1(String word1,String word2){
        int word1Len=word1.length();
        int word2Len=word2.length();
        int l=0,r=0;
        StringBuilder std=new StringBuilder();
        while(l<word1Len && r<word2Len){
            std.append(word1.charAt(l++));
            std.append(word2.charAt(r++));
        }
        if(word1Len==l){
            l=r;
            word1=word2;
            word1Len=word2Len;
        }
        for (int i = l; i < word1Len; i++) {
            std.append(word1.charAt(i));
        }
        return std.toString();
    }
    public static void main(String[] args) {
        String word1 = "abcjk", word2 = "pqr";
        System.out.println(mergeAlternately1(word1,word2));
    }
}
