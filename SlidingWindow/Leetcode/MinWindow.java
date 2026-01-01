package SlidingWindow.Leetcode;

public class MinWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        int[] tFreq = new int[128];
        int[] sFreq = new int[128];
        for (char c : t.toCharArray()) tFreq[c]++;

        int left = 0, start = 0, min = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            sFreq[s.charAt(right)]++;
            while (containsAll(sFreq, tFreq)) {
                int len = right - left + 1;
                if (len < min) {
                    min = len;
                    start = left;
                }
                sFreq[s.charAt(left)]--;
                left++;
            }
        }
        System.out.println(s.substring(start,start+min));
    }

    static boolean containsAll(int[] sFreq, int[] tFreq) {
        for (int i = 0; i < 128; i++) {
            if (sFreq[i] < tFreq[i]) return false;
        }
        return true;
    }
}
