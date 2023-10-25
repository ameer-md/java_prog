package com.ameer.conditions_loops;

import java.beans.JavaBean;
import java.util.Scanner;

public class NumberRepeatition {
    public static void main(String[] args){
        /*
        start
        input: long num, n = number to find
        count = 0
        temp = num

        while(temp != 0)
        remainder = num%10
        if remainder = n:
            count += 1
        temp /= 10
        */

        Scanner input = new Scanner(System.in);
        String num = input.next();
        char n = input.next().charAt(0);
//        System.out.println(+5 == 5);
        int count = 0;

//        while(num != 0){
////          to get individual digit of number
//            int remainder = (int) (num % 10);
//
////            compare with given n
//            if (remainder == n){
//                count++;
//            }
//
////            deleting last digit
//            num /= 10;
//        }

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == n){
                count++;
            }
        }
        System.out.println("count: "+ count);
    }
}
