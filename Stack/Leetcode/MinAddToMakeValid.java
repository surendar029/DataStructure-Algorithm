package Stack.Leetcode;

import java.util.Stack;

public class MinAddToMakeValid {

    static int minAddToMakeValid(String s){
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()){
            if(c=='('){
                stack.push(c);
            } else if (c==')') {
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        return stack.size();
    }

    static int minAddToMakeValid1(String s){
        int open = 0;
        int close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) {
                    close++;
                } else {
                    ;
                    open--;
                }
            }
        }
        return close + open;
    }

    public static void main(String[] args) {
        String s="()";
        System.out.println(minAddToMakeValid1(s));
    }
}
