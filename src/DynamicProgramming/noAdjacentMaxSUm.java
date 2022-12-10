package DynamicProgramming;

import java.util.Arrays;

public class noAdjacentMaxSUm {

    public static void main(String[] args) {
        int[] a = new int[]{75, 105, 120, 75, 90, 135};
        maxSubsetSumNoAdjacent(a);
    }
    public static int maxSubsetSumNoAdjacent(int[] arr) {

        if(arr.length==0) return 0;
        if(arr.length==1) return arr[0];
        if(arr.length==2) return Math.max(arr[0],arr[1]);
        int db[]=new int[3];
        db[0]=arr[0];
        db[1]=Math.max(arr[0],arr[1]);
        int i=2;
        for(;i<arr.length;i++)
        {
            db[2]=Math.max(arr[i]+db[0],db[1]);
            db[0]=db[1];
            db[1]=db[2];
        }
        return db[1];
    }
}
