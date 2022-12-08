package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


public class nSortedArraysToOtherArray {

    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<List<Integer>>();
        arrays.add(Arrays.asList(new Integer[] {1, 5, 9, 21}));
        arrays.add(Arrays.asList(new Integer[] {-1, 0}));
        arrays.add(Arrays.asList(new Integer[] {-124, 81, 121}));
        arrays.add(Arrays.asList(new Integer[] {3, 6, 12, 20, 150}));
        var actual = mergeSortedArrays(arrays);
        System.out.println(actual);
    }
    public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
        // Write your code here.
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(List<Integer> array : arrays) {
            priorityQueue.addAll(array);
        }
        while(!priorityQueue.isEmpty()) {
            result.add(priorityQueue.poll());
        }
        return result;
    }
}
