package Arrayas;

public class ThreeNumberSum {
    public static void main(String[] args) {
        var array = new int[] {1, 0, 0, -1, -1, 0, 1, 1};
        var order = new int[] {0, 1, -1};
        threeNumberSort(array,order);
    }
    public static int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.
        int first = order[0];
        int second = order[1];
        int third = order[2];
        int onecount =0;
        int twocount=0;
        int threecount=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==first)onecount++;
           /* else if () {

            }*/
        }
        return new int[] {};
    }
}
