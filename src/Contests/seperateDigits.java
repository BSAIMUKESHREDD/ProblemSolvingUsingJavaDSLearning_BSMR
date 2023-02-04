package Contests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class seperateDigits {

    public static void main(String[] args) {
        int[] ques = new int[]{1,2,3,7};
        //int[] ques = new int[]{13,25,83,77};
        int[]  m = separateDigits(ques);
        System.out.println(m.toString());
    }
    public  static int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Stack<Integer> toPOp = seprateHelper(nums[i]);
            while(!toPOp.empty()) {
                ans.add((toPOp.pop()));
            }
        }



        int[] maiANs = new int[ans.size()];
int h=0;
        for (int j = 0; j < ans.size(); j++) {
            maiANs[h++] = ans.get(j);
        }
       System.out.println(ans);
        return maiANs;
    }
    
    public static Stack<Integer> seprateHelper(int i) {
        Stack<Integer> a = new Stack<>();

        while (i > 0) {
            a.push(i % 10)  ;
            i = i / 10;
        }
        return a;
    }






    public int[] separateDigitsbestAns(int[] nums) {
        int[] ans = new int[6000];
        int c = 0;
        for(int x:nums){
            Stack<Integer> s = new Stack<>();
            for(int y = x; y > 0; y /= 10)s.push(y%10);  /// learn how to use the third instruction not alwys as ++ or -- we can use others also
            while(!s.isEmpty())ans[c++] = s.pop();
        }
        return Arrays.copyOf(ans, c);
    }

    }

