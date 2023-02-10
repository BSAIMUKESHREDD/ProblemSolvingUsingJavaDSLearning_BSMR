package Strings;
import java.util.*;
public class minCOmmonElement {


    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>(); //to store key value as index and string asscoiated
        List<String> res = new LinkedList<>();
        int minSum = Integer.MAX_VALUE; //initial value
        for (int i=0;i<list1.length;i++) map.put(list1[i], i); // pushing into hashmap
        for (int i=0;i<list2.length;i++) { // lopping in list2

            Integer j = map.get(list2[i]);  //if the string is avaliabe in map get that index associated with it
            if (j != null && i + j <= minSum) {
                if (i + j < minSum) { res.clear(); minSum = i+j; } // we use clear bcoz there will be already a element inside bxoz of old minsum first remove it and then add new element
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
