package Bits;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    static String addBinary(String a, String b) {
        int x = a.length() - 1;
        int y = b.length() - 1;
        int carry = 0;

        StringBuilder str = new StringBuilder();
        while (x >= 0 || y >= 0 || carry != 0) {
            int sum = carry;

            if (x >= 0) sum += a.charAt(x--) - '0';
            if (y >= 0) sum += b.charAt(y--) - '0';

            str.append(sum % 2);
            carry = sum / 2;
        }
        return str.reverse().toString();
    }
}
