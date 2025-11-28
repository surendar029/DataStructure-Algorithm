package Hash.Leetcode;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        int XOR=0;
        for (int num:nums){
            XOR^=num;
        }
        System.out.println(XOR);
    }
}
