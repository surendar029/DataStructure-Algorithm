package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram",t = "nagaram";

        Character[] chArrayA=new Character[s.length()];
        for (int i = 0; i < s.length(); i++) chArrayA[i]=s.charAt(i);

        Character[] chArrayB=new Character[t.length()];
        for (int i = 0; i < t.length(); i++) chArrayB[i]=t.charAt(i);

        Comparator<Character> comp=new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                if(a>b) return 1;
                else if(a<b) return -1;
                return 0;
            }
        };

        Arrays.sort(chArrayA,comp);
        Arrays.sort(chArrayB,comp);

        System.out.println(Arrays.equals(chArrayA,chArrayB));
    }
}
