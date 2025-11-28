package String.Leetcode;

public class MyAtoi {
    public static void main(String[] args) {
        String s="-91283472332";
        int sign=1;
        int len=s.length();
        int i=0,result=0;
        while(i<len && s.charAt(i)==' ') i++;
        if(i<len && (s.charAt(i)=='-' || s.charAt(i)=='+'))
            sign*=(s.charAt(i++)=='-') ? -1 : 1;
        while(i<len && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            if(result>Integer.MAX_VALUE / 10 ||
                    (result==Integer.MAX_VALUE/10 && s.charAt(i)-'0' > Integer.MAX_VALUE%10)
            ){
                System.out.println((sign==1) ? Integer.MAX_VALUE :Integer.MIN_VALUE);
            }
            result=result*10+(s.charAt(i++)-'0');
        }
        System.out.println(Integer.MAX_VALUE);
    }
}
