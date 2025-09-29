package TwoPointer.Leetcode;

import java.util.HashSet;

public class BackspaceCompare {
    static boolean backspaceCompare(String s, String t) {
        return backSpaceHelper(s).equals(backSpaceHelper(t));
    }

    static String backSpaceHelper(String s) {
        int backSpace = 0;
        StringBuilder std = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '#') {
                if (backSpace == 0) {
                    std.append(s.charAt(i));
                } else {
                    backSpace--;
                }
            } else {
                backSpace++;
            }
        }
        return std.reverse().toString();
    }

    static boolean backspaceCompare1(String s, String t) {
        int left=s.length()-1;
        int right=t.length()-1;
        while(left>=0 || right>=0){
            left=backSpaceHelper(s,left);
            right=backSpaceHelper(t,right);

           if(left>=0 && right>=0) {
                if (s.charAt(left) != t.charAt(right)) return false;
            }else if(left>=0 || right>=0){
               return false;
           }
            left--;
            right--;
        }
        return true;
    }
    static int backSpaceHelper(String s, int index) {
        int backSpace=0;
        while(index>=0){
            if(s.charAt(index)!='#'){
                if(backSpace==0){
                    return index;
                }else{
                    backSpace--;
                }
            }else{
                backSpace++;
            }
            index--;
        }
        return index;
    }
    public static void main(String[] args) {
        String s = "bxj##tw", t = "bxj###tw";
        System.out.println(backSpaceHelper(s,s.length()-3));
        System.out.println(backSpaceHelper(t,t.length()-3));
        System.out.println(backspaceCompare1(s,t));
    }
}
