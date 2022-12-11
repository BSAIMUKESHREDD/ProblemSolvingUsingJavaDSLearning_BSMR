package DynamicProgramming;

public class levensteinDist {




        public static int calculate(String x, String y) {
            // Create a table to store results of sub-problems
            int[][] dp = new int[x.length() + 1][y.length() + 1];

            // Fill d[][] in bottom up manner
            for (int i = 0; i <= x.length(); i++) {
                for (int j = 0; j <= y.length(); j++) {

                    // If first string is empty, only option is to
                    // insert all characters of second string
                    if (i == 0)
                        dp[i][j] = j; // Min. operations = j

                        // If second string is empty, only option is to
                        // remove all characters of second string
                    else if (j == 0)
                        dp[i][j] = i; // Min. operations = i

                        // If last characters are same, ignore last char
                        // and recur for remaining string
                    else if (x.charAt(i - 1) == y.charAt(j - 1))
                        dp[i][j] = dp[i - 1][j - 1];

                        // If the last character is different, consider all
                        // possibilities and find the minimum
                    else
                        dp[i][j] = 1 + min(dp[i][j - 1], // Insert
                                dp[i - 1][j], // Remove
                                dp[i - 1][j - 1]); // Replace
                }
            }

            return dp[x.length()][y.length()];
        }

        public static int min(int a, int b, int c) {
            return Math.min(Math.min(a, b), c);
        }

        // Driver code
        public static void main(String args[]) {
            String str1 = "kitten";
            String str2 = "sitting";
            System.out.println(calculate(str1, str2));
        }
    }


