package String.Leetcode;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder builder=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                builder.append(Character.toLowerCase(c));
            }
        }
        int left=0;
        int right=builder.length()-1;
        while (left<=right){
            if(builder.charAt(left)!=builder.charAt(right)){
                System.out.println(false);
            }
            left++;
            right--;
        }
    }
}
