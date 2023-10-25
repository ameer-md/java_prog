package com.ameer.conditions_loops;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float radius = input.nextFloat();

        if(radius > 0){
            double area = Math.PI * (radius * radius);
            System.out.println(area);
        }
        else {
            System.out.println("radius should be positive!");
        }
    }
}
