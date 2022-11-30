package Recursion;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverse;

public class LearningTandemCycle {

    public static void main(String[] args) {
        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = true;

        var actual=  tandemBicycle(redShirtSpeeds,blueShirtSpeeds,fastest);
        int expected = 32;
        System.out.println(actual);

    }

    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        //
        int sum = 0;
        Arrays.sort(redShirtSpeeds);

        Arrays.sort(blueShirtSpeeds);
        if (!fastest){
            reverseArrayInPlace(redShirtSpeeds);
    }
        for (int i = 0; i < blueShirtSpeeds.length; i++) {
           int rider1 =(redShirtSpeeds[i]);
            int rider2=(blueShirtSpeeds[blueShirtSpeeds.length-i-1]);
                sum+=Math.max(rider1,rider2);
        }


        return sum;
    }

    public static void reverseArrayInPlace(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
