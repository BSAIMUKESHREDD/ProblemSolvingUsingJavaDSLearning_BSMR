package Contests;

import java.util.Arrays;

public class getCommonMinimum {


    public static void main(String[] args) {

    }
    //normal approach

    //complexlopping
    public int getCommonusingloppingcomplex(int[] nums1, int[] nums2) {
        for (int i = 0, j = 0, k; i < nums1.length && j < nums2.length; k = nums1[i] < nums2[j] ? i++ : j++) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
        }
        return -1;
    }

    //binary search approach
    public int getCommonUsingBinarySearch(int[] nums1, int[] nums2) {
        for(int v : nums1){
            if(Arrays.binarySearch(nums2, v) >= 0){
                return v;
            }
        }
        return -1;
    }
}
