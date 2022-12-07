package Strings;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        List<String> words =
                new ArrayList<String>(
                        Arrays.asList("yo", "oy", "act", "flop", "tac", "foo", "cat", "olfp"));
        groupAnagrams(words);
    }
/*

    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        List<String> group = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            // System.out.println(words.get(i));
            for (int k = 0; k < words.size(); k++) {
                String word1 = words.get(i);
                String word2 = words.get(k);
                //System.out.println(word1+"   "+word2);
                if (word1.length() == word2.length() && word1 != word2) {
                    int count = 0;
                    for (int j = 0; j < word1.length(); j++) {
                        for (int l = 0; l < word2.length(); l++) {
                            if (word1.charAt(j) == word2.charAt(l)) {
                                count++;
                            }
                        }

                    }
                    if (count == word2.length()) {
                        //System.out.println(word1 );
                        group.add(word1);
                        //System.out.println(group);

                    }
                }


            }
        }

        return new ArrayList();
    }
*/

    public static List<List<String>> groupAnagrams(List<String> words) {

    Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
    for (String word : words) {
        char[] charArray = word.toCharArray();
       // System.out.println(charArray);

        Arrays.sort(charArray);
        //System.out.println(charArray);
        String sortedWord = new String(charArray);
        if (anagrams.containsKey(sortedWord)) {
            anagrams.get(sortedWord).add(word);
        } else {
            anagrams.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
        }
    }
    return new ArrayList<>(anagrams.values());
}

}
