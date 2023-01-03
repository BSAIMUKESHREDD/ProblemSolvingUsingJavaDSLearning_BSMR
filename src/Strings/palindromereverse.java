package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class palindromereverse {

   /* public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        // Write your code here.
        HashSet<String> wordsSet = new HashSet<String>(Arrays.asList(words));
        ArrayList<ArrayList<String>> semordnilapPairs = new ArrayList<ArrayList<String>>();
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            if (wordsSet.contains(reverse) && !reverse.equals(word)) {
                ArrayList<String> semordnilapPair = new ArrayList<String>();
                semordnilapPair.add(word);
                semordnilapPair.add(reverse);
                semordnilapPairs.add(semordnilapPair);
                wordsSet.remove(word);
                wordsSet.remove(reverse);
            }
        }
        return semordnilapPairs;
    }*/


    public static ArrayList<ArrayList<String>> semordnilap(String[] words) {
        // Write your code here.
        ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
        ArrayList<String> ans = new ArrayList<>();

        Set<String> set = new HashSet<>();
             for (String word : words) {
                 set.add(word);
                 int word1Length = word.length();
                 for (String w : words) {
                     int use =0;
                     int wordComparedlenght = w.length();
                    if(wordComparedlenght==word1Length){
                     for (int i = 0; i < w.length(); i++) {
                        if(word.charAt(i)==w.charAt(w.length()-i-1)){
                            use++;
                        }

                     }
                     if(use==word1Length){

                         ans.add(w);
                         ans.add(word);
                         System.out.println(ans.toString());
                     }
                    }
                 }

            ret.add(ans);

             }

        return ret;
    }

    public static void main(String[] args) {
        var input = new String[] {"desserts", "stressed", "hello"};
        ArrayList<ArrayList<String>> expected = new ArrayList<ArrayList<String>>();
        ArrayList<String> pair = new ArrayList<String>();
        pair.add("desserts");
        pair.add("stressed");
        expected.add(pair);

        var actual = semordnilap(input);
       // System.out.println(actual);
       // System.out.println(expected.equals(actual));;
    }
}
