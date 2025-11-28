package TwoPointer.Basics;

public class Trap {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int left = 0, right = height.length - 1;
        int leftMax = height[left++], rightMax = height[right--];
        int result=0;

        while(left<=right){
            if(leftMax<rightMax){
                leftMax=Math.max(leftMax,height[left]);
                result+=leftMax-height[left++];
            }else{
                rightMax=Math.max(rightMax,height[right]);
                result+=rightMax-height[right--];
            }
        }

        System.out.println(result);
    }
}
