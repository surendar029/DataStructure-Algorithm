package Recursion.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    static void combinations(String digit,String[] map,List<String> result,String current){
        if(digit.length()==current.length()){
            result.add(current);
            return;
        }
        String letter=map[digit.charAt(current.length())-'0'];
        for(char c:letter.toCharArray()){
            combinations(digit,map,result,current+c);
        }
    }
    public static void main(String[] args) {
        String digits = "23";
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result=new ArrayList<>();
        combinations(digits,map,result,"");
        System.out.println(result);

    }
}
