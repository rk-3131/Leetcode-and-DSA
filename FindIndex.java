package com.company;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,6,8,9};
        int target = 6;
        int index = 0;

        System.out.println(linearSearch(arr, target, index));
        ArrayList<Integer> temList = new ArrayList<>();

//        ArrayList<Integer> list = findAll(arr, target, index, temList);
//        System.out.println(list);

        ArrayList<Integer> list = findAll2(arr, target, index);
        System.out.println(list);


    }
    static int linearSearch(int [] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
            return linearSearch(arr, target, ++index);
        }
    }


    static ArrayList<Integer> findAll(int [] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAll(arr, target, ++index, list);
    }

    static ArrayList<Integer> findAll2(int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> aboveCall = findAll2(arr, target, ++index);

        list.addAll(aboveCall);
        return list;
    }



}
