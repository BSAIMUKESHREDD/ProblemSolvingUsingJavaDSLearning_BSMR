package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class sortKSortedrray {
    public static void main(String[] args) {
        int[] array =new int[] {3, 2, 1, 5, 4, 7, 6, 5};
       int[] a = sortKSortedArray(array,3);
        int[] b = KSortedArray(array,3);
        System.out.println(Arrays.toString(b));
    }
    public static int[] KSortedArray(int[] array, int k) {
        // Write your code here.
        k++;
        int length = array.length;
        int[] ans = new int[length];
int i=0;
int j=0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
      while(j<array.length) {
          q.offer(array[j]);
          if (q.size() == k ) {

              ans[i++] = q.poll();

          }
          j++;
         // System.out.println(j);
      }
        while (i< array.length) ans[i++]=q.poll();

        return ans;
    }

    public static int[] sortKSortedArray(int[] array, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
 k++;
 int ind=0;
        for (int i = 0; i < array.length; i++) {
            q.add(array[i]);
            if(q.size()==k) array[ind++]= q.poll();
        }
        // the not added elements
        while (ind< array.length) array[ind++]=q.poll();
        return array;
    }
}
