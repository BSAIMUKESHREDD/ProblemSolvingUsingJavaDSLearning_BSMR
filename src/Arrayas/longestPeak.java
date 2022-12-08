package Arrayas;

import java.util.Arrays;

public class longestPeak {

    public static void main(String[] args) {
        var input = new int[]{1, 2, 3, 4,5,1};
        var expected = 6;
        System.out.println(longestPeak(input));
    }

    public static int longestPeak(int[] A) {
        // Write your code here.

        int N = A.length;
        int ans = 0, base = 0;
        while (base < N) {
            int end = base;
            // if base is a left-boundary
            if (end + 1 < N && A[end] < A[end + 1]) {
                // set end to the peak of this potential mountain
                while (end + 1 < N && A[end] < A[end + 1]) end++;

                // if end is really a peak..
                if (end + 1 < N && A[end] > A[end + 1]) {
                    // set end to the right-boundary of mountain
                    while (end + 1 < N && A[end] > A[end + 1]) end++;
                    // record candidate answer
                    ans = Math.max(ans, end - base + 1);
                }
            }

            base = Math.max(end, base + 1);
        }

        return ans;
    }
}
