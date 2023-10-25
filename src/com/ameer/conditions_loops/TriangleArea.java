package com.ameer.conditions_loops;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        float height, base;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter the height and base of triangle: ");
            height = input.nextFloat();
            base = input.nextFloat();

            if(height > 0 && base > 0 ){
                float area = (height * base)/2;
                System.out.println(area);
                break;
            }
            else{
                System.out.println("height and base should be positive!\n");
            }
        }


    }
}
