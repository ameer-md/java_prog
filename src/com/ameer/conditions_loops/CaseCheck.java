package com.ameer.conditions_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        /*
        start
        input: char
        if char >= 'a' && char <= 'z':
            output: lower case
        else:
            output: upper case
         */

        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("upper case");
        }
        else{
        System.out.format("'%c' is not a letter.",ch);
        }
    }
}
