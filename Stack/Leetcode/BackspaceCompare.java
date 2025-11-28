package Stack.Leetcode;

import java.util.Stack;

public class BackspaceCompare {
    static String process(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if (c!='#') stack.push(c);
            if(c=='#' && !stack.isEmpty()) stack.pop();
        }
        return String.valueOf(stack);
    }
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(process(s).equals(process(t)));
    }
}
