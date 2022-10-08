import java.util.ArrayList;

public class ValidIpAddress {
    public static void main(String[] args) {
        String input = "1921680";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1.9.216.80");
        expected.add("1.92.16.80");
        expected.add("1.92.168.0");
        expected.add("19.2.16.80");
        expected.add("19.2.168.0");
        expected.add("19.21.6.80");
        expected.add("19.21.68.0");
        expected.add("19.216.8.0");
        expected.add("192.1.6.80");
        expected.add("192.1.68.0");
        expected.add("192.16.8.0");
        validIPAddresses(input);
    }
    public static ArrayList<String> validIPAddresses(String string) {
        // Write your code here.
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0 ; i < string.length() - 3 ; i++) {
            for(int j = i+1; j < string.length() - 2; j++){
                for(int k = j+1; k < string.length() - 1; k++){
                    String p1 = string.substring(0,i+1);
                    String p2 = string.substring(i+1,j+1);
                    String p3 = string.substring(j+1,k+1);
                    String p4 = string.substring(k+1);
                    if(validIPPart(p1) && validIPPart(p2) && validIPPart(p3) && validIPPart(p4)){
                        result.add(new String(p1+"."+p2+"."+p3+"."+p4));
                        System.out.println(new String(p1+"."+p2+"."+p3+"."+p4));
                    }
                }
            }
        }
        return result;
    }

    public static boolean validIPPart(String part){
        return Integer.parseInt(part)<256 && (part.length()>1 && part.charAt(0) !='0' ||part.length()==1);
    }
}
