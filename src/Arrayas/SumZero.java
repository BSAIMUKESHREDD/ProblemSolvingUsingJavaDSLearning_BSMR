package Arrayas;

import java.util.HashSet;
import java.util.Set;

public class SumZero {
    public  static boolean zeroSumSubarray(int[] nums) {
        // Write your code here.
        Set<Integer> sums = new HashSet<>();
        int currentSum = 0;
        sums.add(0);

        for (int num : nums) {
            currentSum += num;
            if (sums.contains(currentSum)) {

                return true;
            }
            sums.add(currentSum);
            System.out.println(sums);
        }
        return false;
    }
        /*Set<Integer> sums = new HashSet<>();
        int currentSum = 0;
        for (int i: nums) {
            currentSum += i;
            sums.add(currentSum);

            if (i == 0 || currentSum == 0 || !sums.add(currentSum)) {
                return true;
            }
        }
        return false;
    }*/

    public static void main(String[] args) {
        var input = new int[] {4, 2, -1, -1, 3};
        var expected = true;
        System.out.println(zeroSumSubarray(input));;

    }
}
