package Stack.Leetcode;


import java.util.Stack;

public class Calculate {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        Stack<Integer> stack = new Stack<>();
        int number = 0, result = 0, sign = 1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }
            if (c == '+' || c == '-') {
                result += sign * number;
                number = 0;
                sign = (c == '+') ? 1 : -1;
            }
            if (c == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            }
            if (c == ')') {
                result += sign * number;
                number = 0;
                sign = 1;
                result *= stack.pop();
                result += stack.pop();
            }
        }
        result += sign * number;
        System.out.println(result);
    }
}
