package Arrayas;

import java.util.Arrays;

public class smallesetDiffernceIN2arrays {

    public static void main(String[] args) {
        int[]  ar1 = {-1, 5, 10, 20, 28, 3};
        int[] ar2 = {26, 134, 135, 15, 17};
        int[]ans = smallestDifference(ar1,ar2);
        System.out.println(ans[1]);
        System.out.println(ans[0]);


    }


    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
// sorting then 2 pointer approach makes it easy

        Arrays.sort(arrayOne);Arrays.sort(arrayTwo);
        int first = 0;
        int second = 0;

        int current=Integer.MAX_VALUE;
        int samllest=Integer.MAX_VALUE;
        int[] smll =new int[2];
        while(first<arrayOne.length && second< arrayTwo.length){
            int f = arrayOne[first];
            int s = arrayTwo[second];
            if(f<s) {current =s-f;first++;}
            else if(s<f){current = f-s;second++;}
            else return new int[]{f,s};

            if(samllest>current){
                samllest=current;
                smll=new int[]{f,s};
            }
           /* System.out.println(f);
            System.out.println(s);*/
        }

        return smll;
    }
}


