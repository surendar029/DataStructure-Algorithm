package Queue.Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        int size=q.size();
        for (int i = 0; i < size-1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        MyStack st=new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
    }
}
