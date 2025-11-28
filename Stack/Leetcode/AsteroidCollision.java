package Stack.Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {3,5,-6,2,-1,4};
        Stack<Integer> stack=new Stack<>();
        ArrayList list=new ArrayList<>();
        for(int asteroid:asteroids){
            boolean isDestroyed=false;
            while(!stack.isEmpty() && stack.peek()>0 && asteroid<0){
                if(Math.abs(stack.peek())<Math.abs(asteroid)){
                    stack.pop();
                } else if (Math.abs(stack.peek())==Math.abs(asteroid)) {
                    stack.pop();
                    isDestroyed=true;
                } else{
                    isDestroyed=true;
                    break;
                }
            }
            if(!isDestroyed){
                stack.push(asteroid);
            }
        }
        System.out.println(stack);
    }
}
