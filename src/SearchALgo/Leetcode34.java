package SearchALgo;

public class Leetcode34 {
    public static int[] searchRange1(int[] nums, int target) {
       int start = searchRange(nums,target,true);
        int end =searchRange(nums,target,false);
        int ans[] = {start,end};
        return ans;


    }

    public static int searchRange(int[] nums, int target,boolean first) {
      int ans=-1;
        int start = 0;
        int end = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;
            else {
                ans = mid;
                if(first) end=mid-1;
                else start=mid+1;

            }

        }
        return ans;


    }
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target =8;
        int[] ans = {3,4};
      //  searchRange(arr,target);
    }
}
