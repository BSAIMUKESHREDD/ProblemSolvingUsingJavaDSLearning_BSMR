package Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String input = "AlgoExpert is the best!";
        String expected = "best! the is AlgoExpert";
        String actual = reverseWordsInString(input);
        System.out.println(expected==actual);
    }

    public static String reverseWordsInString(String string) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        String sum = "";

        for (int i = 0; i < string.length(); i++) {
            Character searchforspace = string.charAt(i);

            if(searchforspace ==' '){
                ans.add(sum);
                System.out.println(sum);

                sum="";

            }else {
                sum  += string.charAt(i);

            }


        }
        return "";
    }
}
