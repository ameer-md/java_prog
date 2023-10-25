package com.ameer;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args){
        /*
        To calculate Fibonacci Series up to n numbers.
        0,1,1,2,3,5,8,13,.....

        start
        input: number
        arr[] = new int[number]      //creating array of size number
        if number<=2:
        for i=0; i<number; i++      //to fill initial 0,1
            arr[i] = i

        else
            arr[0] = 0
            arr[1] = 1
            for i=2; i<number; i++       // to generate fibonacci sequence
                arr[i] = arr[i-1] + arr[i-2]

        for i = 0; i<number; i++        //output sequence
            output: arr[i]
         */

        /*optimized
        firstTerm = 0
        secondTerm = 1

        loop:
        output: firstTerm
        nextTerm = firstTerm + secondTerm
        firstTerm = secondTerm
        secondTerm = nextTerm
         */


        Scanner input = new Scanner(System.in);
        int number, firstTerm = 0, secondTerm = 1, nextTerm;
        int i;


        System.out.print("Enter the length for fibonacci sequence: ");
        number = input.nextInt();

//        int arr[] = new int[number];

       for(i=0; i<number; i++){
           System.out.print(firstTerm + " ");

           nextTerm = firstTerm + secondTerm;
           firstTerm = secondTerm;
           secondTerm = nextTerm;
       }
        System.out.println();

    }
}
