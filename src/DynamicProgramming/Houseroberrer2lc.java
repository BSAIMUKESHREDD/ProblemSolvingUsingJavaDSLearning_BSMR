package DynamicProgramming;

import java.util.Arrays;

public class Houseroberrer2lc {


    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int a = robHelper(Arrays.copyOfRange(nums,1,nums.length));
        int b = robHelper(Arrays.copyOfRange(nums,0,nums.length-1));
        return Math.max(a,b);

    }


    public int robHelper(int[] nums) {
        int rob1=0;int rob2=0;
        for(int i :nums){
            int temp = Math.max(i+rob1,rob2);
            rob1=rob2;
            rob2=temp;

        }

        return rob2;

    }
}
