package Stack.Leetcode;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=c) {
                System.out.println(false);
            }
        }
    }
}
