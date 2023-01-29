package Arrayas;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String ques ="abccccdd";
        int ans =longestPalindrome(ques);
        System.out.println(ans);
    }

    public static int longestPalindrome(String s) {
        int length =0;
        int oddlength =0;
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


           // System.out.println(map.values()+""+map.keySet());

        for (int i : map.values()) {
            if(i%2==0) length+=i;
            else {
                oddlength++;
                length+= i-1;}
        }

        if(oddlength>0) length++;

        return length;
    }
}
