package String.Leetcode;

public class CapitalizeTitle {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        char[] chArray = title.toCharArray();
        int len = title.length();
        for (int i = 0; i < len; i++) {
            int firstIndex = i;
            while (i < len && chArray[i] != ' ') {
                chArray[i]=Character.toLowerCase(chArray[i]);
                i++;
            }
            if(i-firstIndex>2){
                chArray[firstIndex]=Character.toUpperCase(chArray[firstIndex]);
            }
        }
        System.out.println(String.valueOf(chArray));
    }
}
