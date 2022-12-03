package SearchALgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ques = {1,87,7,8,14,15};
        System.out.println(Arrays.toString(insertionSort(ques)))  ;
    }
    public static int[] insertionSort(int[] array) {
        // Write your code here.
        for (int i = 1; i < array.length; i++) {
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        return array;
    }



  /*  function insertionSort(array) {
        for (let i = 1; i < array.length; i++) {   // we assume that the first element of the array is already sorted and start iterating from the second element of the array;
            let key = array[i];   // set next unsorted array element to equal key;
            let j = i - 1;   // set last sorted element to equal j;
            while (j >= 0 && array[j] > key) {   // check whether the current key is smaller than the last sorted element;
                array[j + 1] = array[j];   // if it is, move the last sorted element to the right (making space for the current key);
                j--;   // move on to the next sorted element;
            }
            array[j + 1] = key;   // if the current key is greater than the last sorted element, place it to the right of the last sorted element;
        }
        return array;   // return the now sorted array.
    }*/
}
