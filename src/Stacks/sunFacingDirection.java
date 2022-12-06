package Stacks;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;

public class sunFacingDirection {
    public static void main(String[] args) {
        int[] buildings = new int[]{3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST";
        sunsetViews(buildings,direction);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.

        if(buildings.length==0)return new ArrayList<>();

        ArrayList<Integer> ans = new ArrayList<>();

        if (direction.equals("WEST")) {

            int max = 0;
            for (int i = 0; i < buildings.length; i++) {
                int cur = buildings[i];
                if (cur > max) {
                    max = cur;
                    System.out.println(i);
                    ans.add(i);
                }


            }

            return ans;
        }else if(direction.equals("EAST")){
            int max = 0;
            for (int i = buildings.length-1; i >= 0; i--) {
                int cur = buildings[i];
                if (cur > max) {
                    max = cur;
                    System.out.println(i);
                    ans.add(i);
                }
            }
        }
       Collections.reverse(ans);
        return ans;
    }

}
