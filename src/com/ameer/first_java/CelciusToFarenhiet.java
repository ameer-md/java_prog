package com.ameer;

import java.util.Scanner;

public class CelciusToFarenhiet{
    public static void main(String[] args){
        /*start
        user input celcius
        celcius to farenhiet formula
        output farenhiet
        exit
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter celcius:");
        float celcius = input.nextFloat();

        float farenhiet = ((celcius* 9)/5) + 32;
        System.out.println(farenhiet+"F");

    }

}