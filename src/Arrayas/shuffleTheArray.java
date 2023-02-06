package Arrayas;

public class shuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) { //writting double loop statements
            res[idx++] = nums[i];
            res[idx++] = nums[j];
        }
        return res;
    }
}
