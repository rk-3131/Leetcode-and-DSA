package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetInArray {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,0};
        int [] index = {0,1,2,3,0};

        System.out.println(Arrays.toString(returnArray(numbers, index)));
    }

    static int [] returnArray(int [] numbers, int [] index){
        int [] arr = new int[numbers.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            list.add(index[i], numbers[i]);
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }

        return arr;


    }


}
