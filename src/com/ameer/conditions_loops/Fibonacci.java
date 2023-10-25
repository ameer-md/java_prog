package com.ameer.conditions_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        /*
        start
        input: nth place
        if (n<1)
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
//
//        while(i < 6){
////            System.out.println(firstNum);
//            int nextNum = firstNum + secondNum;
//            firstNum = secondNum;
//            secondNum = nextNum;
//            i++;
//        }
//        System.out.println(firstNum);

        if(n >= 0 && n < 2) {
            System.out.println(n);
        }

        else {
        while(i <= n){
            int temp = b;
            b = a+b;
            a = temp;
            i++;
        }

//        check input index
            if (n >= 0){
            System.out.println(b);
            } else {
                System.out.println("index starts with 0");
            }

        }


    }
}
