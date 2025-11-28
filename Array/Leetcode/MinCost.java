package Array.Leetcode;

public class MinCost {
    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = {1, 2, 3, 4, 1};
        int sum=0,min=0;
        for (int i = 0; i < colors.length()-1; i++) {
            if(colors.charAt(i)==colors.charAt(i+1)){
                min=Math.min(neededTime[i],neededTime[i+1]);
                sum+=min;
                min=0;
            }
        }
        System.out.println(sum);
    }
}
