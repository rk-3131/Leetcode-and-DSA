package com.company;
//Given two binary strings a and b, return their sum as a binary string.
// 11
//  1
//100
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addition(a, b));
    }

    static String addition(String a, String b){
        StringBuilder sb = new StringBuilder(); // StringBuilder is a class in java which is used to create and initialize new strings in the code
        int i = a.length() - 1;
        int j = b.length() - 1;
//        Here both the variables i and j are initialized to their lenght - 1 values as we will be iterating through strings from reverse order as addition of the strings is made from lsb
        int carry = 0; // Carry is initialized to zero as at the start it should be zero but later on it can be incremented according to addition going on


        while (i >= 0 || j >= 0){
            int Sum = carry;
// Sum is initialized to value of the carry value so as it can be used for later part of iteration
            if (i >= 0) {
                Sum += a.charAt(i) - '0';
            }
            if (j >= 0){
                Sum += b.charAt(j) - '0';
            }
// Here both of the variables at their respective values in string are added
// They are subtracted from zero to covert the characters into numbers

            sb.append(Sum % 2); // Here modulo operator is used for the purpose of carrying it into next calculation and storing the value in either of 0 and 1 form

            carry = (Sum /2);  // The carry will be carried to next calculation in the form of 1 or 0
            i--;
            j--;
        }
        if (carry != 0){
            sb.append(carry);
//            At last the string will be updated with carry if it is there.
        }
        return sb.reverse().toString();
//        String is returned in reverse order as addition has been done from LSB to MSB but we want answers from MSB
    }

}
