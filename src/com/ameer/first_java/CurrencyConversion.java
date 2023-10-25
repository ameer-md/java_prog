package com.ameer;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        /*Input currency in rupees and output in USD.
        start
        input: amount(rupees)
        usd = rupees * 0.012
        output: usd
        exit
         */
        Scanner input = new Scanner(System.in);
        float rupees, usd;

        rupees = input.nextFloat();
//        usd = rupees * 0.01204f;      //Addition
//        System.out.printf("usd: %.2f\n",usd);

        usd = rupees / 83.12f;      //subtraction
        System.out.printf("usd: %.2f\n", usd);
        System.out.printf("usd: %.2f\n", rupees % 83.12f);


    }
}
