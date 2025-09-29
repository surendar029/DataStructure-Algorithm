package Array.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow=result.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i-1; j++) {
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        int numRows=5;
        System.out.println(generate(numRows));
    }
}
