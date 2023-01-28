package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeatingElement {
    public static void main(String[] args) {
        boolean ans = longestSubstringWithoutDuplication("clementisacap").equals("mentisac");
        int as = longestNumberSubstringWithoutDuplication("clementisacap");
        System.out.println(as);
        System.out.println(ans);
    }

    //slidingwindowtypeproblems
    public static int longestNumberSubstringWithoutDuplication(String str) {
        // Write your code here
        int i = 0;
        int max = 0;
        int j = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (j < str.length()) {
            if (!hashSet.contains(str.charAt(j))) {
                hashSet.add(str.charAt(j));
                j++;
                max = Math.max(max,hashSet.size() );
            } else {
                hashSet.remove(str.charAt(i));
                i++;
            }
        }
        // System.out.println(sb.toString());
        return max;
    }


    public static String longestSubstringWithoutDuplication(String str) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int[] longest = {0, 1};
        int startIdx = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (lastSeen.containsKey(c)) {
                startIdx = Math.max(startIdx, lastSeen.get(c) + 1);
            }
            if (longest[1] - longest[0] < i + 1 - startIdx) {
                longest = new int[]{startIdx, i + 1};
            }
            lastSeen.put(c, i);
        }
        String result = str.substring(longest[0], longest[1]);
        return result;
    }
}