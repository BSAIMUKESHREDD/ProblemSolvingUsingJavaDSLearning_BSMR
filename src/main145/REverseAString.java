package main145;

public class REverseAString {

    public static void main(String[] args) {
       char[]  ques = new char[]{'h', 'e', 'l', 'l', 'o'};
       reverseString(ques);
        System.out.println("hiiiiiiiiiiii");
    }

    public  static void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){    //Do it half the number of String length
            char tmp = s[i];
            s[i] = s[s.length-1-i];     //Front swap with other End side
            s[s.length-1-i] = tmp;      //End swap with other Front side
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }



    public static void swap(char a ,char b ){

        char temp= a;
        a=b;
        b=temp;
    }
}
