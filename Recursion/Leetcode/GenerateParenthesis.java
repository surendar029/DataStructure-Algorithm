package Recursion.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static void generate(List<String> result, String stack, int open, int close, int max) {
        if (stack.length() == (max * 2)) {
            result.add(stack);
            return;
        }
        if (open < max) {
            generate(result, stack + "(", open + 1, close, max);
        }
        if(close<open){
            generate(result, stack + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        System.out.println(result);
    }
}
