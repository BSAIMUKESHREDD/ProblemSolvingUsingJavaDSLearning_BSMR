package Stacks;

import java.util.Arrays;

public class nextMaxInACircularArray {
    public static void main(String[] args) {
        int[] ques ={2,5,-3,-4,6,7,2};
        nextGreaterElement(ques);
        System.out.println("Hello World");
    }
    public static int[] nextGreaterElement(int[] array) {
        // Write your code here.

        int[] ans = new int[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i-1]>array[i]){
               int max= array[i];
                ans[i]=max;
            }
            else {

            }
        }
         return ans;
    }
}

