package com.ameer;

import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args){
        /*
        To find out whether the given String is Palindrome or not.
        start
        input: string
        if len(array) = odd:
            for i=0,j=len(array)-1 ; i<len(array)/2 && j>length(array)/2 ; i++,j--
                if arr[i] != arr[j]:
                    output: "not a palindrome"
                     exit
        else
            for i=0, j=len(array)-1; i<j; i++,j--
                if arr[i] != arr[j]:
                    output: "not a palindrome"
                    exit

        output: "string is a palindrome"
         */


        /*
        start
        input: str
        reverse str
        compare original str with reverse string
        output:palindrome or not
        exit
         */

        Scanner input = new Scanner(System.in);
        System.out.print("enter string (check palindrome or not): ");
        String str = input.next();
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        System.out.println(reverse.equals(str));

//        boolean flag = true;   //to check string palindrome or not

//        int i,j;
//        if(str.length() % 2 != 0){
//            for(i=0,j=str.length()-1; i<str.length()/2 && j>str.length()/2; i++,j--){
//                System.out.println(str.charAt(i) +" " +str.charAt(j));
//                if(str.charAt(i) != str.charAt(j)){
//                    flag = false;
//                    break;
//                }
//            }
//
//        }
//
//        else{
//            for(i=0,j=str.length()-1; i<j; i++,j--){
//                System.out.println(str.charAt(i) +" "+ str.charAt(j));
//                if(str.charAt(i) != str.charAt(j)){
//                    flag = false;
//                    break;
//                }
//            }
//        }[madam]




//        if(flag){
//            System.out.println(str+" is  a palindrome.");
//        }
//        else{
//            System.out.println(str+" is not a palindrome.");
//        }

        }

    }
