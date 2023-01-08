package Contests;

public class categoryBox {
    public static void main(String[] args) {
       String a =  categorizeBox(2909,
                3968,
                3272,
                727);
        System.out.println(a);

    }
    public static String categorizeBox(int length, int width, int height, int mass) {
        String ans="";
         long volume = (long) length * width * height;
        boolean heavy= mass>=100;
        boolean bulky = length >= 1e4 || width >= 1e4 || height >= 1e4 || volume >= (int) 1e9;


        if(bulky && heavy) ans="Both";
        else if(!bulky && !heavy) ans= "Neither";
        else if(bulky && !heavy) ans= "Bulky";
        else if(!bulky && heavy) ans= "Heavy";

        return ans;
    }
}
