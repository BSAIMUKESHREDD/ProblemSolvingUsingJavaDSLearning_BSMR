package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsRecursion {
    public static void main(String[] args) {
        String ques = "abkaallalla";
       // removeAlphabet("","aaaabbbbbahahahahan");
        // System.out.println(ans);

        List<Integer> name =  Arrays.asList(1, 2, 3);
        powerset(name);
    }



    public static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
            subsets.add(new ArrayList<Integer>());
        for (Integer ele : array) {
            int length = subsets.size();
            for (int i = 0; i < length; i++) {
                List<Integer> cur = new ArrayList<Integer>(subsets.get(i));
                cur.add(ele);
                subsets.add(cur);
            }
        }

        return subsets;
    }



/*
    public static void removeAlphabet(String happy, String unhappy){

       if(unhappy.isEmpty()){
           System.out.println(happy);
           return ;
       }
      char ch = unhappy.charAt(0);
       if(ch=='a'){
            removeAlphabet(happy,unhappy.substring(1));
       }else{
            removeAlphabet(happy+ch,unhappy.substring(1));
       }


    }*/
}
