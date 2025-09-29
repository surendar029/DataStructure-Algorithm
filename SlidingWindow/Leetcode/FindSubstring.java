package SlidingWindow.Leetcode;

import java.util.*;

public class FindSubstring {

    static List<Integer> findSubstring(String s,String[] words){
        HashMap<String,Integer> setOfWords=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(String word:words) setOfWords.put(word,setOfWords.getOrDefault(word,0)+1);
        int totalWords=words.length,wordLen=words[0].length(),totalChar=wordLen*totalWords;
        for (int i = 0; i <= s.length()-totalChar; i++) {
            HashMap<String,Integer> result=new HashMap<>();
            for (int j = i; j < i+totalChar; j=j+wordLen) {
                result.put(s.substring(j,j+wordLen),result.getOrDefault(s.substring(j,j+wordLen),0)+1);
            }
            if(result.equals(setOfWords)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words={"word","good","best","good"};
        HashMap<String,Integer> setOfWords=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(String word:words) setOfWords.put(word,setOfWords.getOrDefault(word,0)+1);
        int totalWords=words.length,wordLen=words[0].length(),totalChar=wordLen*totalWords;
        for (int i = 0; i <= s.length()-totalChar; i++) {
            HashMap<String,Integer> result=new HashMap<>();
            for (int j = i; j < i+totalChar; j=j+wordLen) {
                result.put(s.substring(j,j+wordLen),result.getOrDefault(s.substring(j,j+wordLen),0)+1);
            }
            if(result.equals(setOfWords)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
