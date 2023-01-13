package Arrayas;

import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeating {

    public static void main(String[] args) {
        findTwoElement(new int[]{13,33,43,16,25,19,23,31,29,35,10,2,32,11,47,15,34,46,30,26,41,18,5,17,37,39,6,4,20,27,9,3,8,40,24,44,14,36,7,38,12,1,42,12,28,22,45
        },47);

    }
   static   int[] findTwoElement(int arr[], int n) {
        // code here
       Arrays.sort(arr);
       HashMap<Integer,Boolean> map=new HashMap<>();
       int repeated =0;
       int missing =0;
       for(int i=0;i<n;i++){
           if(map.get(arr[i])==null){
               map.put(arr[i],true);
           }
           else{
               repeated=arr[i];
           }

           for (int j = 1; j < map.size(); j++) {
               if(map.get(j) == null){
                  missing=j;
               }
           }
       }






       System.out.println(repeated+""+missing);
       return new int[]{repeated,missing};
    }


    /*
    *  int[] findTwoElement(int v[], int n) {
        // code here
        int ans[] = new int[2];
        for(int i = 0; i < n; i++) {
            int x = Math.abs(v[i]) - 1;

            if(v[x] < 0)
                ans[0] = x + 1;
            else {
                v[x] = -v[x];
            }
        }

        for(int i = 0; i < n; i++) {
            if(v[i] > 0) {
                ans[1] = i+1;
                break;
            }
        }

        return ans;

    }*/
}
