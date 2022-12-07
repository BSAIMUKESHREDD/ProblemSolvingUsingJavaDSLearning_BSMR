package Strings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class WordsForOcuurence {

    public static void main(String[] args) {
        String[] words = new String[] {"this", "that", "did", "deed", "them!", "a"};
        char[] expected = new char[] {'t', 't', 'h', 'i', 's', 'a', 'd', 'd', 'e', 'e', 'm', '!'};
        var actual = minimumCharactersForWords(words);
        System.out.println(expected==actual);
    }

  /*  public static char[] minimumCharactersForWords(String[] words) {
        // Write your code here.
        int count =1;
        Hashtable<Character,Integer> preAns = new Hashtable<Character,Integer>();
            for(String i : words){
                for (int j = 0; j < i.length(); j++) {
                   char alp = i.charAt(j);
                   // System.out.println(alp);
                    if(alp==i.charAt(j)){
                        count++;
                        System.out.println(count);

                    }
                    preAns.put(alp,count);
                    count=0;
                }
            }
        return new char[] {};
    }
*/

    public static char[] minimumCharactersForWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>();
            for (Character c : word.toCharArray()) {
                temp.put(c, temp.getOrDefault(c, 0) + 1);
                if (!map.containsKey(c)) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                    sb.append(c);
                }
                else if (temp.get(c) > map.get(c)) {
                    map.put(c, map.get(c) + 1);
                    sb.append(c);
                }
            }
        }

        return sb.toString().toCharArray();
    }
}
