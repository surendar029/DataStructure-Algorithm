package String.Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractIntegerWords {
    public static void main(String[] args) {
        String s = "No Integers";
        ArrayList<String> result=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                stringBuilder.append(ch);
            }else{
                if(stringBuilder.length()>0){
                    result.add(stringBuilder.toString());
                    stringBuilder=new StringBuilder();
                }
            }
        }
        if(stringBuilder.length()>0) result.add(stringBuilder.toString());
        if(result.isEmpty()) result.add("No Integers");
        System.out.println(result);
    }
}
