package Arrayas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findingNOnRepeatingNUmberLEetcode136 {

    //ques:  https://leetcode.com/problems/single-number/


    public static void main(String[] args) {
        int[] ques = {1,1,2,2,4,2,5,4,7,89,7,4,1,2,4,5};

    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> a = new HashMap<>();
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(a.containsKey(nums[i])) count++;
            a.put(i,count);
        }

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.values());
        }

    return 0;
    }
// learn XOR operator imp?
}
