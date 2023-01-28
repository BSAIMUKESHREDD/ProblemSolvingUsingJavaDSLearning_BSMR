package Arrayas;

public class mergeSortedArray {


    public static void main(String[] args) {
        int[] a ={1,2,5,0,0,0};
        int[] b = {8,57,95};
        merge(a,3,b,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) {
            nums1[finished--] = nums2[tail2--];
        }
    }


   /* class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m-1 , p2 = n-1 ,i = m+n-1;
            while(p2 >=0 ){
                if(p1 >=0 && nums1[p1] > nums2[p2]){
                    nums1[i--] = nums1[p1--];
                }
                else{
                    nums1[i--] = nums2[p2--];
                }
            }
        }*/

}
