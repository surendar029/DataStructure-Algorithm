package Array.Basics;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int total=0;
        for(int num:arr) total+=num;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int num:arr){
            int sum=total-num;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }
        System.out.println(min + "->" + max);
    }
}
