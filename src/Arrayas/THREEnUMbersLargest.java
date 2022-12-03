package Arrayas;

public class THREEnUMbersLargest {
    public static void main(String[] args) {
        int[] m = {1, 10, 7, 58, -96};
//        findThreeLargestNumbers(m);
    }



    public static int[] swap(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

            }

        }
        return array;
    }

        /*public static int[] findThreeLargestNumbers(int[] ar){
            // Write your code here.


            return new int[]{-1, -1, -1};
        }*/

    }
