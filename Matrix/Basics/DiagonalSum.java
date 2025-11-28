package Matrix.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalSum {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(11, 2, 4));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(10, 8, -12));

        int sum1=0;
        for (int i = 0; i < arr.size(); i++) {
                sum1+=arr.get(i).get(i);
        }
        int sum2=0, len =arr.get(0).size();
        for (int i = 0; i < arr.size(); i++) {
            sum2+=arr.get(i).get(len - 1 - i);
        }
        System.out.println(sum2);

    }
}
