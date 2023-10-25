package com.ameer.conditions_loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        /*
        start
        input: num1,num2,num3
        if num1 > num2 F:
            if num1 > num3 T
            exit
        else if num2 > num3:
            num2
            exit
        else num3
            exit
         */

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

//        if(num1 > num2){
//            if(num1 > num3){
//                System.out.println("largerst: "+ num1);
//            } else {
//                System.out.println("largest: "+ num3);
//            }
//        }
//
//        else if(num2 > num3){
//            System.out.println("largest: "+ num2);
//        }
//
//        else{
//            System.out.println("largest: "+ num3);
//        }

//        int max = 0;

//        check if num2 or num3 maximum
//        if(num2 > max){
//            max = num2;
//            if (num3 > max){
//                max = num3;
//        }
//        }
//
//        else if(num3 > max){
//            max = num3;
//        }

        //Another way
//        if (num2 > max){
//            max = num2;
//        }
//
//        if(num3 > max){
//            max = num3;
//        }

        //Another way
//        if (num1 > num2){
//            max = num1;
//        }
//        else{
//            max = num2;
//        }
//
//        if(num3 > max){
//            max = num3;
//        }

        //Another way
        System.out.println("largest: "+ Math.max(num3,Math.max(num1,num2)));
        System.out.println("program ended!");
    }
}
