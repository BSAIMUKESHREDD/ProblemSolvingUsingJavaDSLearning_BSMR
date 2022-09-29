import java.util.regex.Pattern;

public class RunLengthEncoding {

    public static void main(String[] args) {
        var input = "AAAAAAAAAAAAAAAAAAAAAABBBBCCCDDEEEEE";
        var expected = "9A4A2B4C2D";
        var actual = runLengthEncoding(input);
        System.out.println(actual);
        System.out.println(expected.equals(actual));
    }
    public static String runLengthEncoding(String string) {
        // Write your code here.
       /* String ans ="";
        int count = 1;
        char first = string.charAt(0);
        for (int i = 0; i < string.length(); i++) {

            if(i < string.length() - 1 && string.charAt(i) == string.charAt(i + 1)  ){ //MAIN PROBLEM COMES IN THIS STEP
                count++;                                                               // woithout i<string.length()-1 we will get wrong ans
            }else{
                ans+=string.charAt(i);
            if(count>9){count=9;}
                ans+=count;

            count=1;}
        }

        return ans;*/



        StringBuilder encodedStringCharacters = new StringBuilder();
        int currentRunLength = 1;
        for (int i = 1; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            char previousCharacter = string.charAt(i - 1);
            if ((currentCharacter != previousCharacter) || (currentRunLength == 9)) { // the line currRunLenght == 9 is important
                encodedStringCharacters.append(Integer.toString(currentRunLength));
                encodedStringCharacters.append(previousCharacter);
                currentRunLength = 0;
            }
            currentRunLength += 1;
        }


        encodedStringCharacters.append(Integer.toString(currentRunLength));
        encodedStringCharacters.append(string.charAt(string.length() - 1));
        return encodedStringCharacters.toString();






    }
}
