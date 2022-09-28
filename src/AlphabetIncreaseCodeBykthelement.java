public class AlphabetIncreaseCodeBykthelement {

    public static void main(String[] args) {
       String x =  caesarCypherEncryptor("xbc",3);
    }

   // public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
      /*  int[] arr = new int[str.length()];
        Character[] ans = new Character[str.length()];
        String alphabets = "abcedefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
             arr[i] =   alphabets.indexOf((str.charAt(i))) ;
              ans[i]=alphabets.charAt(arr[i]+key%26);

            System.out.println(ans[i]);
        }

        return ans.toString();*/



        public static String caesarCypherEncryptor(String str, int key) {
            char[] newLetters = new char[str.length()];
            int newKey = key % 26;
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < str.length(); i++) {
                newLetters[i] = getNewLetter(str.charAt(i), newKey, alphabet);
            }
            return new String(newLetters);
        }
        public static char getNewLetter(char letter, int key, String alphabet) {
            int newLetterCode = alphabet.indexOf(letter) + key;
            return alphabet.charAt(newLetterCode % 26);
        }
    }

