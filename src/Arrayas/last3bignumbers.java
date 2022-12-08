package Arrayas;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class last3bignumbers {
    public static void main(String[] args) {
        int[] ques = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
       int[] an =  findThreeLargestNumbers(ques);
        System.out.println(Arrays.toString(an));
    }
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] ans = new int[3];
        PriorityQueue<Integer> p =new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            p.offer(array[i]);
        }
        for (int i = 2; i >=0; i--) {
            ans[i] = p.poll();
        }

        return ans;
    }


}
