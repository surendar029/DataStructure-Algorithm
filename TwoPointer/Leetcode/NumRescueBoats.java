package TwoPointer.Leetcode;

import java.util.Arrays;

public class NumRescueBoats {
    static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boat=0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            boat++;
            right--;
        }
        return boat;
    }
    public static void main(String[] args) {
        int[] nums={3,2,2,1};
        int limit = 3;
        int[] arr = new int[limit+1];
        for (int w : nums) {
            arr[w]++;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
