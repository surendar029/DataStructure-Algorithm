package Hash.Leetcode;

public class CanConstruct {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        int[] freq=new int[128];
        for (char ran:ransomNote.toCharArray()) freq[ran]++;
        for (char mag:magazine.toCharArray()) freq[mag]--;
        for(int f:freq){
            System.out.print(f);
        }
    }
}
