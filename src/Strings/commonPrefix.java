package Strings;

import java.util.Arrays;

public class commonPrefix {

    public static void main(String[] args) {
       String[] strs = (new String[]{"flower", "flow", "flight"});
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
