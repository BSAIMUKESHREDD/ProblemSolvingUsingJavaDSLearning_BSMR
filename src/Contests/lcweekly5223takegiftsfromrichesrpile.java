package Contests;

import java.util.Arrays;

public class lcweekly5223takegiftsfromrichesrpile {
    public static void main(String[] args) {
        int[] ques = new int[]{25,64,9,4,100};

        pickGiftsusingort(ques,4);
    }


    public static long pickGiftsusingort(int[] gifts, int k) {
        int ans =0;
        while(k>0){
            Arrays.sort(gifts);
            gifts[gifts.length-1] = (int) Math.sqrt(gifts[gifts.length-1]);

            // int MaxmumValue =  Arrays.stream(gifts).max().getAsInt();
            //int index  = Arrays.asList(gifts).indexOf(MaxmumValue);
k--;
        }

        ans = Arrays.stream(gifts).sum();
        System.out.println(ans);
        return ans;
    }
    public static long pickGifts(int[] gifts, int k) {
int ans =0;
        while(k>0){
            int MaxmumValue =  Arrays.stream(gifts).max().getAsInt();
            int index  = Arrays.asList(gifts).indexOf(MaxmumValue);
            gifts[index] = (int) Math.sqrt(MaxmumValue);
            k--;
        }

        ans = Arrays.stream(gifts).sum();

        return (long)ans;
    }
}
