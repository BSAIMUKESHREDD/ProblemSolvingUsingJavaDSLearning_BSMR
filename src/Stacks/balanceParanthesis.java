package Stacks;

import java.util.Stack;

public class balanceParanthesis {

    public static void main(String[] args) {
        String input = "{[[[[({(}))]]]]}";
        System.out.println(balancedBrackets(input));
    }
    public static boolean balancedBrackets(String str) {
        // Write your code here.
        int onesum=0;
        int twosum=0;
        int threesum=0;
        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            if(sum<0)return false;
            if(str.charAt(i)=='(') onesum++;sum++;
            if(str.charAt(i)==')') onesum--;sum--;
            if(str.charAt(i)=='{')twosum++;sum++;
            if(str.charAt(i)=='}')twosum--;sum--;
            if(str.charAt(i)=='[')threesum++;sum++;
            if(str.charAt(i)==']')threesum--;sum--;
            }
        if(onesum!=0||twosum!=0||threesum!=0||sum!=0)return false;
        return true;
        }

    public class BracketChecker {
        public static boolean isBalanced(String str) {
            // Create a stack to keep track of opening brackets
            Stack<Character> stack = new Stack<>();

            // Loop through the string and check each character
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                // If the character is an opening bracket, push it onto the stack
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }
                // If the character is a closing bracket, pop the most recent opening bracket
                // and check if the bracket types match
                else if (c == ')' || c == ']' || c == '}') {
                    if (stack.isEmpty()) {
                        // If the stack is empty, then there is no matching opening bracket
                        // for the closing bracket, so the string is not balanced
                        return false;
                    }
                    char open = stack.pop();
                    if ((open == '(' && c != ')') || (open == '[' && c != ']') || (open == '{' && c != '}')) {
                        // If the bracket types do not match, then the string is not balanced
                        return false;
                    }
                }
            }

            // If the stack is not empty at the end of the string, then there are
            // unmatched opening brackets, so the string is not balanced
            return stack.isEmpty();
        }


    }



}

