package com.ameer.methods;

import java.util.Scanner;

public class Find_Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max_num = max(num1, num2, num3);
        int min_num = min(num1, num2, num3);
        System.out.println("Max: "+max_num);
        System.out.println("Min: "+min_num);
    }

    static int max(int num1, int num2, int num3){
        int max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        return max;
    }

    static int min(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
           min = num3;
        }
        return min;
    }

}
