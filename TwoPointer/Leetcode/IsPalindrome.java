package TwoPointer.Leetcode;

public class IsPalindrome {
    static boolean isPalindrome(String s) {
        StringBuilder std = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                std.append(Character.toLowerCase(c));
            }
        }
        return std.toString().equals(std.reverse().toString());
    }

    static boolean isPalindrome1(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1(s));
    }
}
