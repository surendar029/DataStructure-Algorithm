package TwoPointer.Leetcode;

public class MaxArea {
    static int maxArea(int[] height){
        int left=0;
        int right= height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int min=Math.min(height[left], height[right]);
            int distance=right-left;
            int area =min*distance;
            max=Math.max(max, area);
            if(height[left]< height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
