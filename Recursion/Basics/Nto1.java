package Recursion.Basics;

import java.util.ArrayList;
import java.util.List;

public class Nto1 {

    public static List<Integer> fun(int n) {
        if (n == 0) {
            return new ArrayList<>();  // base case → empty list
        }
        List<Integer> result = fun(n - 1);  // recursive call
        result.add(n);                     // add current number
        return result;
    }


    public static void main(String[] args) {
        System.out.println(fun(5));
    }
}
