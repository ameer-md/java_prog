package com.ameer;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        /*Take 2 numbers as input and print the largest number.
        start
        input:num1,num2
        if num1>num2:
            output:num1
            exit
        else:
            output:num2
            exit
        */

        Scanner input = new Scanner(System.in);
        int num1,num2;

        System.out.print("enter first number: ");
        num1 = input.nextInt();

        System.out.print("enter second number: ");
        num2 = input.nextInt();

        if(num1>num2){
            System.out.println(num1+ " is largest");
        }

        else if(num2>num1){
            System.out.println(num2+" is largest");
        }

        else{
            System.out.println(num1+" and "+num2+" are same");
        }


    }
}
