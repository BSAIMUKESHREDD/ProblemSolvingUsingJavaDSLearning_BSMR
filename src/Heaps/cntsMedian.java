package Heaps;

import java.util.PriorityQueue;

public class cntsMedian {
    static class ContinuousMedianHandler {
        double median = 0;

        public void insert(int number) {
            // Write your code here.
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            queue.offer(number);

        }

        public double getMedian() {
            return median;
        }
    }
}
