package Strings;

public class LongestPalindromicSubSequence {

    public static void main(String[] args) {
            String test = "babad";
            String a = PalindromicSubstring(test);
           //boolean b = isPalindrome("bb");
        System.out.println(a);
    }

    // time limit exceeded

    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
            String ans = "";
            int len =0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                String ne = str.substring(i,j);
               // System.out.println(ne);

                if(isPalindrome(ne)){
                    int length = ne.length();
                    if(len< length){
                       len= length;
                       ans = ne;
                   }

                  // System.out.println(len);
                }

            }
          
        }
        return ans;
    }


    // 2 ponter + recursion
    public static String PalindromicSubstring(String str) {
        // Write your code here.
        String ans = "";
        // System.out.println(ne);
        int i = 0;
        int j = str.length() - 1;
        if (str.charAt(i) == str.charAt(j)) {
            if (isPalindrome(str)) {
                return str;
            }
        }
        else {
            return "";
        }
            return PalindromicSubstring(str.substring(i, j + 1)) + PalindromicSubstring(str.substring(i+1, j+1));
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev+=str.charAt(i);
        }

       // System.out.println(rev);
        return  rev.equals(str); //should not write ==
    }


    public static String AlllongestPalindromicSubstring(String str) {
        // Write your code here.
        int length = str.length()-1;
        for (int i = 1; i <length && str.charAt(i-1)==str.charAt(i+1); i++) {


        }
        return "";
    }



}
