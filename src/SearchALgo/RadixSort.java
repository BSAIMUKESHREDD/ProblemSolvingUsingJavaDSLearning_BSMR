package SearchALgo;

import java.util.ArrayList;
import java.util.Collections;

public class RadixSort {

    // implementation using arraylist
    public ArrayList<Integer> radixSort(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return array;
        }
        int maxNumber = Collections.max(array);
        int digit = 0;
        while ((maxNumber / Math.pow(10, digit)) > 0) {
            countingSort(array, digit);
            digit += 1;
        }
        return array;
    }
    public void countingSort(ArrayList<Integer> array, int digit) {
        int[] sortedArray = new int[array.size()];
        int[] countArray = new int[10];

        int digitColumn = (int) Math.pow(10, digit);
        for (int num : array) {
            int countIndex = (num / digitColumn) % 10;
            countArray[countIndex] += 1;
        }


        for (int idx = 1; idx < 10; idx++) {
            countArray[idx] += countArray[idx - 1];}
        for (int idx = array.size() - 1; idx > -1; idx--) {
            int countIndex = (array.get(idx) / digitColumn) % 10;
            countArray[countIndex] -= 1;
            int sortedIndex = countArray[countIndex];
            sortedArray[sortedIndex] = array.get(idx);}
        for (int idx = 0; idx < array.size(); idx++) {
            array.set(idx, sortedArray[idx]);

        }}



    // using array
/*    public static void radixSort(int[] arr) {
        // Find the maximum number to know number of digits
        int max = getMax(arr);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; max/exp > 0; exp *= 10)
            countSort(arr, exp);
    }

    // A utility function to get maximum value in arr[]
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // A function to do counting sort of arr[] according to
// the digit represented by exp.
    public static void countSort(int[] arr, int exp) {
        int[] output = new int[arr.length]; // output array
        int[] count = new int[10];

        // Store count of occurrences in count[]
        for (int i = 0; i < arr.length; i++)
            count[ (arr[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }*/


}


