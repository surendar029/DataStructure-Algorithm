package String.Leetcode;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            if(Character.isLetter(str[start])){
                if(Character.isLetter(str[end])){
                    char temp=str[start];
                    str[start++]=str[end];
                    str[end--]=temp;
                }else{
                    end--;
                }
            }else{
                start++;
            }
        }
        System.out.println(String.valueOf(str));
    }
}
