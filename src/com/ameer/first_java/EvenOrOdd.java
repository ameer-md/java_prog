package com.ameer;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        /*
        start
        input:number
        if number%2:
            output:"even"
            exit
        else output:"odd"
        exit
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = input.nextInt();

        if(number%2==0){
            System.out.println(number+" is even.");
        }
        else{
            System.out.println(number+" is odd.");
        }


    }
}
