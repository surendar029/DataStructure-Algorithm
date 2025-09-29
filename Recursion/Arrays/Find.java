package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Find {

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) return false;
        return target == arr[index] || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        return target == arr[index] ? index : findIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index==arr.length) return;
        if(arr[index]==target) list.add(index);
        findAllIndex(arr, target, index+1);
    }

    static ArrayList findAllInList(int[] arr, int target, int index,ArrayList<Integer> list1){
        if(index==arr.length) return list1;
        if(arr[index]==target) list1.add(index);
        return findAllInList(arr, target, index+1,list1);
    }

    static ArrayList addNElement(int[] arr,int index,ArrayList<Integer> list){
        if(index== arr.length) return list;
        list.add(arr[index]);
        return addNElement(arr,index+1,list);
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 6, 8, 3, 2};
        int target = 2;
        System.out.println(findIndex(arr, target, 0));
        ArrayList list1=addNElement(arr,0,new ArrayList<>());
        findAllIndex(arr,target,0);
        System.out.println(list1);
    }
}
