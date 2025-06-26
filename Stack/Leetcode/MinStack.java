package Stack.Leetcode;

import java.util.ArrayList;

public class MinStack {

    ArrayList<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int i) {
        stack.add(i);
    }

    public int getMin() {
        return stack.stream().mapToInt(i -> i).min().orElse(0);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
