package Array.Leetcode;

import java.util.HashMap;

public class FindMaxLength {
    public static void main(String[] args) {
        int[] nums={0,1,1,1,1,1,0,0,0};
        int sum=0;
        int length=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            sum+=nums[i]==0 ? -1 : 1;
            if(sum==0){
                length=i+1;
            } else if (map.containsKey(sum)) {
                length=Math.max(length,i- map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        System.out.println(length);
    }
}
