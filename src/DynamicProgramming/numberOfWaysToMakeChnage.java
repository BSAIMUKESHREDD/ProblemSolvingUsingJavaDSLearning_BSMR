package DynamicProgramming;

public class numberOfWaysToMakeChnage {
    public static void main(String[] args) {
        int[] input = {1, 5};
        int n=6;
        numberOfWaysToMakeChange(2,input);
    }
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        // Write your code here.
        int[] ways = new int[n + 1];
        ways[0] = 1;
        for (int denom : denoms) {
            for (int amount = 1; amount < n + 1; amount++) {
                if (denom <= amount) {
                    ways[amount] += ways[amount - denom];
                }
            }
        }
        return ways[n];

    }
}
