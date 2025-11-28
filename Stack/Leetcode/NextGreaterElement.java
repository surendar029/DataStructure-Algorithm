package Stack.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>(Collections.nCopies(arr.length,-1));
        for (int i = arr.length-1; i >=0 ; i--) {
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    list.set(i,stack.peek());
                }
                stack.push(arr[i]);
        }
        System.out.println(list);
    }
}
