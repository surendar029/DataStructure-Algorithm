package String.Leetcode;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        StringBuilder builder = new StringBuilder();
        int len = s.length(), i = 0;
        while (i <= len) {
            while (i < len && s.charAt(i) == ' ') i++;
            int j = i + 1;
            while (j < len && s.charAt(j)!=' ') j++;
            String sub=s.substring(i,j);
            if(builder.length()==0){
                builder.append(sub);
            }else{
                builder.insert(0,sub+" ");
            }
            i=j+1;
        }
        System.out.println(builder);
    }
}
