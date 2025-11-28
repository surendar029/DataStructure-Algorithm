package Stack.Leetcode;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Stack<String> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=']'){
                stack.push(String.valueOf(c));
            }else{
                StringBuilder temp=new StringBuilder();
                while (!stack.peek().equals("[")){
                    temp.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder num=new StringBuilder();
                while (!stack.empty() && Character.isDigit(stack.peek().charAt(0))){
                    num.insert(0,stack.pop());
                }
                String repeat=temp.toString().repeat(Integer.parseInt(num.toString()));
                stack.push(repeat);
            }
        }
        StringBuilder str=new StringBuilder();
        for(String st:stack) str.append(st);
        System.out.println(str);
    }
}
