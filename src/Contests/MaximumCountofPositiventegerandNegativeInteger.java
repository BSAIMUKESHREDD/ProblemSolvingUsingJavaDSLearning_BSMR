package Contests;

/*
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.
 */
public class MaximumCountofPositiventegerandNegativeInteger {

    public static void main(String[] args) {
        int[] ques = {-3,-2,-1,0,0,1,2};
        int a = maximumCount(ques);
        System.out.println(a);
    }
    public static int maximumCount(int[] nums) {
        int id0 =0;
        int countNEg =0;
        int countPos=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) id0++;
            if(nums[i]<0) countNEg++;
            if(nums[i]>0) countPos++;
        }
        return Math.max(countPos,countNEg);
    }
}

