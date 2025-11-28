package Stack.Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleArea {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int n = heights.length,max=0;
        int[] nse=getNSE(heights,n);
        int[] pse=getPSE(heights,n);
        for (int i = 0; i < n; i++) {
            int width=nse[i]-pse[i]-1;
            int area=heights[i]*width;
            max=Math.max(max,area);
        }
        System.out.println(max);
    }

    public static int[] getPSE(int[] height, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] pse = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return pse;
    }

    public static int[] getNSE(int[] height, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] nse = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return nse;
    }
}
