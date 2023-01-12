package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxSum2342 {
    public static void main(String[] args) {
        int[] ques = new int[]{18, 43, 36, 13, 7};
        maximumSum(ques);
    }

    public static int maximumSum(int[] nums) {
        Map<Integer, int[]> afterSum = new HashMap<Integer, int[]>();
        for (int i = 0; i < nums.length; i++) {
            int s = sumOfDigits(nums[i]);
            afterSum.put((sumOfDigits(nums[i])), new int[]{nums[i], -1});
        }


        // to print hashmap
        // for (Map.Entry<Integer, Integer> entry : afterSum.entrySet()) {
        //   System.out.println(entry.getKey() + " : " + entry.getValue());
        //}
        return 0;
    }


    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }



/*
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int sum=0;
            while(num>0){
                int r = num%10;
                sum=sum+r;
                num=num/10;
            }
            if(map.containsKey(sum)){
                int s = map.get(sum);
                if(s+nums[i]>max)
                    max=s+nums[i];
                if(nums[i]>s)
                    map.replace(sum,nums[i]);
            }
            else
                map.put(sum,nums[i]);
        }
        return max;
    }
    }
 */
}