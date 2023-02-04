package com.company;

//989. Add to Array-Form of Integer
//Input: num = [1,2,0,0], k = 34
//        Output: [1,2,3,4]
//        Explanation: 1200 + 34 = 1234

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int [] arr = {9,9,9,9,9,9,9,9,9,9};
        int number = 1;
        System.out.println(Addition(arr, number));

    }
    static List<Long> Addition(int [] nums, int number){
        ArrayList<Long> myList = new ArrayList<>();
        long Sum = 0;

        for (int i = 0; i < nums.length; i++){
            int tempNumber = nums[i];         // 1 2
            Sum = (Sum * 10) + tempNumber;     // 1 12 120 1200
        }


        long addition = number + Sum;   //1234

        long temp = 0;
        while (addition > 0){
            temp = addition % 10;    //4
            myList.add(temp);        // 4
            addition /= 10;
        }
        ArrayList<Long> list = new ArrayList<>();

        for (int i = myList.size() - 1; i >= 0; i--){
            list.add(myList.get(i));

        }

        return list;

    }
}
