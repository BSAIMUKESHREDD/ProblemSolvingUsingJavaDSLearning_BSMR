import java.util.HashMap;

public class FirstNonRecurringCharacter {
    public static void main(String[] args) {
        String input = "abcdcaf";
        int expected = 1;
        var actual = firstNonRepeatingCharacter(input);
        System.out.println(expected==actual);
    }
    public static int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        int count =0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for (int i = 0; i <string.length() ; i++) {
           Character ch = string.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1);

        }

        for (int i = 0; i < string.length(); i++) {
            Character c = string.charAt(i);
                if(hm.get(c)==1){return i;}

        }

        return -1;
    }
}
