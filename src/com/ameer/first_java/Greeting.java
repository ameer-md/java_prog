package com.ameer;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        /*
        Take name as input and print a greeting message for that particular name.
        start
        input: "name"
        output: Hello + name!
         */

        Scanner input = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = input.nextLine();

        System.out.println("Hi "+name);
    }
}
