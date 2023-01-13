package Recursion;

import java.util.PriorityQueue;

public class print1t0nwithoutLoop {
    public static void main(String[] args) {
        int N =10;
        printNos(N);
    }

    public static   void printNos(int n)
    {
        if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;

    }
}
