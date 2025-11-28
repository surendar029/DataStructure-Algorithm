package Stack.Leetcode;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = ")()())";
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    max=Math.max(max,i-stack.peek());
                }
            }
        }
    }
}
