package Strings;

import java.util.HashMap;

public class GenerateDocument {

    public static void main(String[] args) {

    }

    public boolean generateDocument(String characters, String document) {
     /*   // Write your code here.
        int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 1; i < characters.length(); i++) {
              Character a = characters.charAt(i);
              if(characters.charAt(i)==characters.charAt(i-1)){
                  count++;
              }
            hm.put(a,count);

        }
        return false;
    }*/


        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        for (int idx = 0; idx < characters.length(); idx++) {
            char character = characters.charAt(idx);
            characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
        }
        for (int idx = 0; idx < document.length(); idx++) {
            char character = document.charAt(idx);
            if (!characterCounts.containsKey(character) || characterCounts.get(character) == 0) {
                return false;
            }
            characterCounts.put(character, characterCounts.get(character) - 1);
        }
        return true;

    }
}