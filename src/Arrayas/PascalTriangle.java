package Arrayas;

import java.util.*;

public class PascalTriangle  {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j < numRows; j++) {
                row.add(1);

            }
        }


return ans;
    }
}
