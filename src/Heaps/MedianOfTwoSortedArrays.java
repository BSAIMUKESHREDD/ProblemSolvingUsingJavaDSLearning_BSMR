package Heaps;

import java.util.PriorityQueue;

public class MedianOfTwoSortedArrays {

    /*
    * LeetCode question
    *  link: https://leetcode.com/problems/median-of-two-sorted-arrays/
    *
    *
    * */


    public static void main(String[] args) {
        int[] num2={1,2,74,158};
        int[] num1={14,78,100};
        findMedianSortedArrays(num1,num2);
    }
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((x,y)->y-x);

        for (int i = 0; i < nums1.length; i++) {
            minHeap.offer(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(minHeap.peek()<nums2[i]){
                maxHeap.offer(nums2[i]);
            }else{

            }
        }
            return 0.0;
    }
}
