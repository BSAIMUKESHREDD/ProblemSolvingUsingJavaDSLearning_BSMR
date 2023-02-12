package Contests;

public class maxJumpGFGcontest89 {

    static int minJump(int arr[], int n){
        boolean[] aux = new boolean[n];
        for(int i =0;i<n;i++){
            if(arr[i]%2==0||arr[i]%3==0) aux[i]=true;
        }

        int ans = maxDistance(aux);
        return ans;

    }


    static   int maxDistance(boolean[] arr) {
        int maxDistance = 0;
        int lastTrueIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                if (lastTrueIndex != -1) {
                    maxDistance = Math.max(maxDistance, i - lastTrueIndex);
                }
                lastTrueIndex = i;
            }
        }
        return maxDistance;
    }
}
