package Arrayas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class sumZEROLargest {
    public  static int zeroSumSubarray(int[] nums) {
        // Write your code here.
        int sum =0;
        int max =0;

        HashMap<Integer,Integer> map = new HashMap<>();

for (int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(sum==0){
                max=i+1;
            }else{

                    if(map.containsKey(sum) ){
                        max =Math.max(max,i-map.get(sum));
                    }else{
                        map.put(sum,i);
                    }

            }

        }


return max;
    }


    public static void main(String[] args) {
        var input = new int[] {1, -1, 3,2,-2,-8,1,7,10,23};

        System.out.println(zeroSumSubarray(input));;

    }

}
