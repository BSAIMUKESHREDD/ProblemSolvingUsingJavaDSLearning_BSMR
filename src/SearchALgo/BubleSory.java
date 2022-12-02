package SearchALgo;

import java.util.Arrays;

public class BubleSory {
    public static void main(String[] args) {
        int[] ques = {1,87,7,8,14,15};
        System.out.println(Arrays.toString(selectionSort(ques)))  ;

    }

    public static int[] selectionSort(int[] arr) {
        // Write your code here.
        if(arr.length==0) return new int[]{};
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }


    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        int length =array.length-1;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
                length--;
            }
        }
        return array;
    }
}
