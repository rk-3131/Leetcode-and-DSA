package com.company;

public class LSByRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        int index = 0;

        System.out.println(linearSearch(arr, target, index));

    }
    static boolean linearSearch(int [] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, ++index);
    }
}
