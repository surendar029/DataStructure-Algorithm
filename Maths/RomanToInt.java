package Maths;

import java.util.HashMap;

public class RomanToInt {
    static HashMap<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int sum=0;
        for (int i = 0; i < s.length()-1; i++) {
            sum=(map.get(s.charAt(i))>=map.get(s.charAt(i+1))) ? sum+map.get(s.charAt(i)) : sum-map.get(s.charAt(i));
        }
        System.out.println(sum+map.get(s.charAt(s.length()-1)));
    }
}
