package com.ameer;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        /*
        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        start
        input: Principal ammount(flaot)
        input: time(float)
        input: rate(float)

        si = (p*r*t)/100

        output: si
        exit
         */
        Scanner input = new Scanner(System.in);

        System.out.print("enter principal amount: ");
        float principal = input.nextFloat();

        System.out.print("enter interest rate: ");
        float rate = input.nextFloat();

        System.out.print("enter time period: ");
        float time = input.nextFloat();

        double simpleInterest = (principal*rate*time)/100;

        System.out.println("Simple Interest: "+ simpleInterest);


    }

}