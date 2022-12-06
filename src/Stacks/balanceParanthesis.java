package Stacks;

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

    }

