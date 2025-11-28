package Array.Basics;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Median {
    public static void main(String[] args) {
        List<Integer> arr = IntStream.rangeClosed(0, 6)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(arr);
        int n= arr.size();
        int median;
        if(n%2==1){
            median= arr.get(n/2);
        }else{
            median= (arr.get((n-1)/2)+arr.get(n/2))/2;
        }
        System.out.println(median);
    }
}
