package Heaps;

import java.util.ArrayList;
import java.util.List;

public class minHeap {
    static class MinHeap {
        List<Integer> heap = new ArrayList<Integer>();

        public MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        public List<Integer> buildHeap(List<Integer> array) {

            int n = array.size();
            int lastIndex = n-1;
            int firstParentIdx = ((lastIndex)-1)/2;
            for( int currIdx= firstParentIdx; currIdx >=0; currIdx--){
                siftDown(currIdx, n-1, array);
            }

            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            // Write your code here.
            while (2 * currentIdx + 1 <= endIdx) {
                int lChild = 2 * currentIdx + 1;
                int rChild = lChild + 1;

                int swapIdx = -1;  // right side unda leda chudu
                if (rChild > endIdx || heap.get(lChild) <= heap.get(rChild)) {
                    swapIdx = lChild;
                } else {
                    swapIdx = rChild;
                }
                if (heap.get(swapIdx) < heap.get(currentIdx)) {
                    swap( currentIdx, swapIdx,heap);
                    currentIdx = swapIdx;
                } else {
                    return;
                }
            }
        }



        public void siftUp(int currentIdx, List<Integer> heap) {
            // Write your code here.
                int parentIdx = (currentIdx-1)/2;
                while(parentIdx>=0 && heap.get(parentIdx) > heap.get(currentIdx)){
                    swap(currentIdx,parentIdx,heap);
                    currentIdx=parentIdx;
                    parentIdx= (currentIdx-1)/2;
                }
            }


        public int peek() {
            // Write your code here.
            return heap.get(0);
        }

        public int remove() {
            // Write your code here.
            swap(0,heap.size()-1,heap);
            siftDown(0, heap.size()-1,heap);
            return heap.remove(heap.size()-1);
        }

        public void insert(int value) {
            // Write your code here.
            heap.add(value);
            siftUp(heap.size()-1,heap);
        }


        public static void swap(int i, int j, List<Integer> heap){
            int temp = heap.get(i);

            heap.set(i,heap.get(j));
            heap.set(j,temp);
        }
    }
}
