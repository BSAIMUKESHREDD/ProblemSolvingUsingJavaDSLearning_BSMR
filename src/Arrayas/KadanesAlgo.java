package Arrayas;

public class KadanesAlgo {

    public static void main(String[] args) {
        int[] ques ={1,2,3,4,-10};
        checkSubarraySum(ques);
    }

    public static int checkSubarraySum(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
