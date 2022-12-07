package Strings;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        // Write your code here.
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev+=str.charAt(i);

        }
        return  rev==str;
    }

    public static void main(String[] args) {
     //   System.out.println("Hello world!");
        System.out.println( isPalindrome("hiih"));

    }
}
