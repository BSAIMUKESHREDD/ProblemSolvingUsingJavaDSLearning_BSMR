package Recursion;

public class learningRecursion {
    public static void main(String[] args) {
        Print(10);
    }

    public static int Print(int n) {
        if (n == 0) {
            return 0;

        } else {
            System.out.println(n);
            return Print(n-1);
        }

    }
}