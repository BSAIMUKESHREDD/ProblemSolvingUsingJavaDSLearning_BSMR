package Heaps;

import java.util.PriorityQueue;

public class cntsMedian {


    public static void main(String[] args) {
        ContinuousMedianHandler ans = new ContinuousMedianHandler();
        ans.insert(5);
        ans.insert(10);
        ans.insert(100);
        ans.insert(10);
        ans.insert(0);
        ans.insert(54);
        System.out.println(ans.getMedian()) ;
    }
      static class ContinuousMedianHandler {
        double median = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((x,y)->y-x);
        public void insert(int number) {
            minHeap.offer(number);

            if(minHeap.size()>maxHeap.size()) maxHeap.offer(minHeap.poll());
            else if(maxHeap.size()>minHeap.size()) minHeap.offer(maxHeap.poll());

            if(minHeap.size()>maxHeap.size()) median = (double)minHeap.peek();
            else if(maxHeap.size()>minHeap.size()) median = (double)maxHeap.peek();
            else median = ((double)maxHeap.peek()+(double)minHeap.peek())/2;
        }


        public double getMedian() {
            return median;
        }
    }
}
