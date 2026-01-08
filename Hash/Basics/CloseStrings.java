package Hash.Basics;

import java.util.Arrays;

public class CloseStrings {
    public static void main(String[] args) {
        String word1 = "cabbba", word2 = "abbccc";
        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(char word:word1.toCharArray()) freq1[word-'a']++;
        for(char word:word2.toCharArray()) freq2[word-'a']++;

        for(int i=0;i<freq1.length;i++){
            if(freq1[i]==0 && freq2[i]!=0 || freq1[i]!=0 && freq2[i]==0) {
                System.out.println(false);
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        System.out.println(Arrays.equals(freq1,freq2));
    }
}
