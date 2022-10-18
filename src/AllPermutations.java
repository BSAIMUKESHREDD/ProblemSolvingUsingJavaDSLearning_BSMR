import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPermutations {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<List<Integer>> perms = getPermutations(input);

    }
        public static List<List<Integer>> getPermutations(List<Integer> array) {
            // Write your code here.
            List<List<Integer>> permutations = new ArrayList<List<Integer>>();
            getPermutations(array, new ArrayList<Integer>(), permutations);
            return permutations;

        }
        public static void getPermutations(
                List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> permutations) {
            if (array.size() == 0 && currentPermutation.size() > 0) {
                permutations.add(currentPermutation);
            } else {
                for (int i = 0; i < array.size(); i++) {
                    List<Integer> newArray = new ArrayList<Integer>(array);
                    newArray.remove(i);
                    List<Integer> newPermutation = new ArrayList<Integer>(currentPermutation);
                    newPermutation.add(array.get(i));
                    getPermutations(newArray, newPermutation, permutations);
                }
            }

        }
        // Write your code here.


    }


