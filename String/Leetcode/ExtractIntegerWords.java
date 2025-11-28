package String.Leetcode;

import java.util.ArrayList;

public class ExtractIntegerWords {
    public static void main(String[] args) {
        String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
        ArrayList<String> num=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                str.append(c);
            }else{
                if(str.length()>0){
                    num.add(str.toString());
                    str=new StringBuilder();
                }
            }
        }
        if(str.length()>0) {
            num.add(str.toString());
        }
        System.out.println(num);
    }
}
