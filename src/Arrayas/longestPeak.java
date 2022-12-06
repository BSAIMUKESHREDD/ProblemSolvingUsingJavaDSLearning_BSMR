package Arrayas;

import java.util.Arrays;

public class longestPeak {

    public static void main(String[] args) {
        var input = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        var expected = 6;
        System.out.println(longestPeak(input));
    }

    public static int longestPeak(int[] array) {
        // Write your code here.
        int count = 0;

        int m = 0;
        for (int i = 1; i < array.length - 2; ) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                int ans = 1;
                int j = i;
                while (j > 0 && array[j] > array[j - 1]) {
                    j--;
                    ans++;
                }
                while (i < array.length - 1 && array[i] > array[i + 1]) {
                    i++;
                    ans++;
                }
                count = Math.max(count, ans);

            } else {
                i++;
            }



            //System.out.println(max);

        }
        return count;
    }
}
