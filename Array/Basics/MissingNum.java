package Array.Basics;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        int XOR=0;

        for (int i = 1; i <= arr.length+1 ; i++) {
            XOR^=i;
        }
        for(int num:arr) XOR^=num;
        System.out.println(XOR);
    }
}
