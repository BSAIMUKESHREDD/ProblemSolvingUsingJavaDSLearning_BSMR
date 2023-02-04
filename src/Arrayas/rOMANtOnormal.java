package Arrayas;

import java.util.HashMap;
import java.util.Map;

public class rOMANtOnormal {
    public static void main(String[] args) {
        String m = "MCMXCIV";
       int a =  romanToInt(m);
        System.out.println(a);   }

    public static int romanToInt(String s) {
        Map<Character,Integer> val = new HashMap<>();
        val.put('I',1);
        val.put('V',5);
        val.put('X',10);
        val.put('L',50);
        val.put('C',100);
        val.put('D',500);
        val.put('M',1000);
int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(val.containsKey(s.charAt(i))){
                sum+=val.getOrDefault(s.charAt(i),0);
                System.out.println(sum);
            }
        }

return sum;
    }
}
