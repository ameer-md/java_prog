package com.ameer.conditions_loops;

import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args){
        /*
        start
        input:num
        convert num to string
        reverse string
        output: reversed str
        exit
         */

        Scanner input = new Scanner(System.in);

//        String num = input.next();
////        initialized
//        String rev_num = "";
//
////        add last index char to rev_num
//        for(int i = num.length()-1 ; i >= 0; i--){
//            rev_num += num.charAt(i);
////            System.out.println(rev_num);
//        }

//        int num = input.nextInt();
//        int revNum = 0;
//        int tempNum = num;
//        int count = 0;
//
////         count digits of num
//        while(tempNum > 0){
//            count++;
//            tempNum/=10;
//        }
//
////        value reset
//        tempNum = num;
//
////        reverse digits
//        for(int i = count-1; i >= 0; i--){
////            get individual digit
//            int remainder =  tempNum % 10;
////            multiply digit with decimal place
//            revNum += remainder * Math.pow(10, i);
////            delete digit
//            tempNum /= 10;
//        }


//        int num = input.nextInt();
//        int revNum = num % 10;
//        num /= 10;
//
//        while(num > 0){
//
//        int remainder = num % 10;
//        revNum = revNum * 10 + remainder;
//        num /= 10;
//        }


        int num = input.nextInt();
        int revNum = 0;

        while(num > 0){
        int remainder = num % 10;
//        shift digit to right
        revNum = revNum * 10 + remainder;
        num /= 10;
        }


        System.out.println(revNum);
    }
}
