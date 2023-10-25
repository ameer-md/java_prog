package com.ameer.first_java;

import java.util.Arrays;
import java.util.Scanner;


public class Calculation {

    public static void main(String[] args){
        /*Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        start
        input: num1, num2, operator
        if operator == +: add   exit
        if operator == -: sub   exit
        if operator == *: mul   exit
        if operator == /: div   exit


         */
//
        Scanner input = new Scanner(System.in);
//
        float num1,num2,result = 0;
        char operator;

        System.out.println("enter num1, operator, num2:");
        num1 = input.nextFloat();
        operator = input.next().charAt(0);
        num2 = input.nextFloat();

        if(operator == '+'){
             result = num1 + num2;
        }

        else if(operator == '-'){
             result = num1 - num2;
        }

        else if(operator == '*'){
             result = num1 * num2;
        }

        else if(operator == '/') {
             result = num1 / num2;
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+result);

            }
}
