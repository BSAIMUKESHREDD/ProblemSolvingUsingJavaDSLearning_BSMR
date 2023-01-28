package Arrayas;

import java.util.Arrays;
import java.util.HashMap;

public class majorityElement169LC {


    public static void main(String[] args) {
        int[] q = {2,2,1,1,1,2,2};
        majorityElement(q);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        /*Arrays.sort(nums);
        int n = nums.length / 2;
        for (int i = 0; i < nums.length - 1; i++) {

        }*/
        return 0;
    }
}