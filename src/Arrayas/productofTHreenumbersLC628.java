package Arrayas;

import java.util.Arrays;

public class productofTHreenumbersLC628 {


    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int b = nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(a,b);
    }
}


/**
 int ans = nums[0]*nums[1]*nums[2];
 int negCount=0;
 int posCount=0;
 int zeroCount=0;
 //for(int i:nums){ if(nums[i]<0) negCount++; }else if(nums[i]==0) zeroCount++; else posCount++;

 // ans = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
 // if(nums[0]<0) ans = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

 return ans;

 */

