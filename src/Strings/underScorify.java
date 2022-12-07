package Strings;

public class underScorify {
    public static String underscorifySubstring(String str, String substring) {
        // Write your code here.
   collapseLocations(getLocations(str,substring));

        return "";
    }


    public static String collapseLocations(String something){
        for (int i = 0; i < something.length()-1; i++) {
            if(((int) something.charAt(i))-((int) something.charAt(i+1)) <=4){

            }else{

            }

        }
        return "abs";
    }
    public static String getLocations(String str,String substring){
StringBuilder sb = new StringBuilder() ;
        for (int i = 0; i < str.length()-substring.length(); i++) {
            if((str.substring(i,i+substring.length())).equals("test")){
                System.out.println(i);
                sb.append(i);
            }
          //  System.out.println(str.substring(i));
            //System.out.println(sb);
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String expected = "_test_this is a _testtest_ to see if _testestest_ it works";
        String output =
                underscorifySubstring(
                        "testthis is a testtest to see if testestest it works", "test");
        System.out.println(expected=output);
    }

}
