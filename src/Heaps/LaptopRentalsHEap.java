package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LaptopRentalsHEap {

    public static void main(String[] args) {
        int[][] times = new int[][] {{0, 2}, {1, 4}, {4, 6}, {0, 4}, {7, 8}, {9, 11}, {3, 10}};
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        for (int[] time : times) {
            input.add(new ArrayList(Arrays.asList(time[0], time[1])));
        }
    laptopRentals(input);
    }
    public static int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        // Write your code here.
        PriorityQueue<Integer>  p = new PriorityQueue<Integer>();
        //PriorityQueue<Integer>  p = new PriorityQueue<Integer>();
        for (int i = 0; i < times.size(); i++) {
            p.add(times.get(i).get(0));
            p.add(times.get(i).get(1));
        }
        System.out.println(p);

        return -1;
    }



   /* public int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        // Write your code here.
        if(times.isEmpty()) {
            return 0;
        }
        Collections.sort(times, (a,b)->Integer.compare(a.get(0),b.get(0)));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(times.get(0).get(1));
        for(int i = 1; i<times.size(); i++) {
            if(minHeap.peek()<=times.get(i).get(0)) {
                minHeap.remove();
            }
            minHeap.add(times.get(i).get(1));
        }
        return minHeap.size();
    }*/
}
