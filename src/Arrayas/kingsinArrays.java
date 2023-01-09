package Arrayas;

import java.util.ArrayList;

public class kingsinArrays {
    public static void main(String[] args) {
        int[] num ={1,17,45,84,75,2};
        ArrayList<Integer> ans = leaders(num,6);

    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();

        ArrayList<Integer> ans = new ArrayList<>();
        int ma = 0;
        ans.add(arr[arr.length-1]);
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1])  ans.add(arr[i]);

        }

        for (int i = ans.size(); i >=0; i++) {
            a.add(ans.get(i));
        }
        return a;
    }

    /*

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>li = new ArrayList<>();

        int max=arr[n-1];
        li.add(max);
        if(n==1)
        {
            return li;
        }
        for(int i=n-2;i>=0;i--)
        {
         if(arr[i]>=max)
         {
             li.add(arr[i]);
            max=arr[i];
         }
        }
        Collections.reverse(li);
        return li;

    }
    * */

}
