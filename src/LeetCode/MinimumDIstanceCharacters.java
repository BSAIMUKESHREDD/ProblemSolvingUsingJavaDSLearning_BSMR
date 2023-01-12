package LeetCode;

import java.util.Arrays;

public class MinimumDIstanceCharacters {

    public static void main(String[] args) {
       String  s = "loveleetcode";
       char c = 'e';
       shortestToChar(s,c);
    }

    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];


        Arrays.fill(ans, n);
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == c) ans[i] = 0;
            else if(i > 0) ans[i] = Math.min(ans[i], ans[i-1] + 1);
        }

        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == c) ans[i] = 0;
            else if (i < n-1) ans[i] = Math.min(ans[i], ans[i+1] + 1);
        }
        return ans;
    }
   /* public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
               sum=0;
               ans[i]=sum;
            }else{
            sum++;
                ans[i]=sum;
            }
            System.out.println(ans[i]);

        }*/
       // System.out.println();
       // return ans;
    }


   /* class Solution {
        public int[] shortestToChar(String S, char C) {
            int[] result = new int[S.length()];

            int currDist = S.length();
            for (int i = 0; i < S.length(); ++i) {

                currDist = S.charAt(i) == C ? 0 : currDist + 1;
                result[i] = currDist;
            }

            currDist = S.length();
            for (int i = S.length() - 1; i >= 0; --i) {

                currDist = S.charAt(i) == C ? 0 : currDist + 1;
                result[i] = Math.min(result[i], currDist);
            }

            return result;
        }*/


