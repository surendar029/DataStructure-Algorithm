package TwoPointer.Basics;

public class LongestPalindrome {
    static int expand(String s,int left,int right){
        while(left>=0 && right<=s.length()-1 &&
        s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String s="babad";
        int start=0,max=0;
        for (int i = 0; i < s.length(); i++) {
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>max){
                start=i-((len-1)/2);
                max=len;
            }
        }
        System.out.println(s.substring(start,start+max));

    }
}
