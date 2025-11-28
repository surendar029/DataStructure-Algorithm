package Stack.Leetcode;

import java.util.Stack;

public class MyQueue {
    static Stack<Integer> in;
    static Stack<Integer> out;

    MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public static void push(int x) {
        in.push(x);
    }

    public static int pop(){
        shiftStacks();
        return out.pop();
    }

    public static int peek(){
        shiftStacks();
        return out.peek();
    }
    private static void shiftStacks(){
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        for (int i = 0; i < 5; i++) {
            push(i);
        }
        System.out.println(peek());
    }
}
