package Stack.Leetcode;


import java.util.Stack;

public class Calculate {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        Stack<Integer> stack = new Stack<>();
        int number = 0, result = 0, sign = 1;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            if (ch == '+' || ch == '-') {
                result += sign * number;
                number = 0;
                sign = (ch == '+') ? 1 : -1;
            }
            if (ch == '(') {
                stack.push(result);
                stack.push(sign);

                result=0;
                sign=1;
            }
            if(ch==')'){
                result+=sign*number;
                number=0;
                result*=stack.pop();
                result+=stack.pop();
            }
        }
        result+=sign*number;
        System.out.println(result);
    }
}
