package String.Leetcode;

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        int[] hash=new int[128];
        for(char c:s.toCharArray()){
            hash[c-'0']++;
        }
        boolean flag=false;
        int result=0;
        for (int i:hash){
            if(i%2==0){
                result+=i;
            }else{
                flag=true;
                result+=i-1;
            }
        }
        System.out.println(result);
    }
}
