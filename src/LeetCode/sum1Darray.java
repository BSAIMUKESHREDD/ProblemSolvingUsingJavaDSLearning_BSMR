package LeetCode;

public class sum1Darray {

    public static void main(String[] args) {
        int[] nums = {1,5,7,1,14};
        runningSum(nums);
    }
    public static int[] runningSum(int[] nums) {
        int[] ans= new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i] =ans[i]+nums[i];
        }

        return ans;
    }




    public static int[] runningSumeff(int[] nums) {
        for (int i=1;i<nums.length;i++){
           // nums[i] = nums[i-1]+nums[i];
            nums[i]+=nums[i-1];
       }

        return nums;
    }
}
