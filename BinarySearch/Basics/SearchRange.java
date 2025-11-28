package BinarySearch.Basics;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8,ans=0;
        int left=0,right=nums.length-1;
        int result=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result=mid;
                if(false){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            } else if (nums[mid]>target) {
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        System.out.println(2<2);
    }
}
