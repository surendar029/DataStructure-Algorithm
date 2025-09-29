package BinarySearch.Leetcode;

public class SearchInsert {

    static int searchInsert(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    static int searchInsert1(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=2;
        System.out.println(searchInsert(nums,target));
        System.out.println(searchInsert1(nums,target));
    }
}
