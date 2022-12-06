package Stacks;

import java.util.ArrayList;
import java.util.Arrays;

public class SortStac {

    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<Integer>(Arrays.asList(-5, 2, -2, 4, 3, 1));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(-5, -2, 1, 2, 3, 4));
        ArrayList<Integer> ans =  sortStack(stack);
        System.out.println(ans.toArray());
    }
    public static ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
        // Write your code here.
        if(stack.size()==0)return stack;
        int top= stack.remove(stack.size()-1); //();
        sortStack(stack);
        insert(stack,top);

        return stack;
    }

    public static void insert(ArrayList<Integer> stack,int value){
        if(stack.size()==0 || (stack.get(stack.size()-1) <=value)){
            stack.add(value);
            return;
        }
        int tip = stack.remove(stack.size()-1);
        insert(stack,value);
        stack.add(tip);
    }
}
