package SearchALgo;

import java.util.Arrays;
import java.util.HashMap;

public class threeNUmberSOrt {
    public static void main(String[] args) {
        var array = new int[] {1, 0, 0, -1, -1, 0, 1, 1};
        var order = new int[] {0, 1, -1};
        threeNumberSort(array,order);
    }

    public static int[] threeNumberSort(int[] array, int[] order) {
        int currentIndexToBeSorted=0;
        for (int currentNumberInOrder : order) {
            for (int i = currentIndexToBeSorted +1; i < array.length; i++) {
                if (array[currentIndexToBeSorted] == currentNumberInOrder) {
                    currentIndexToBeSorted += 1;
                } else if (currentNumberInOrder == array[i]) {
                    swap(array, currentIndexToBeSorted, i);
                    currentIndexToBeSorted += 1;
                }
            }
        }
        return array;
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
