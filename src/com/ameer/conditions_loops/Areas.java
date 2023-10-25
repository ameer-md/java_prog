package com.ameer.conditions_loops;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length, height;
        double ans = 0;

        while(true){
            System.out.println("Enter 1 - 8 to choose corresponding shape:");
            System.out.println("1. Rectangle\t2. Parallelogram\t3. Triangle\t 4. Isosceles Triangle");
            System.out.println("5. Rhombus\t6. Square\t7. Circle\t8. Equilateral Triangle\t\t9. Exit:");

            short choice = input.nextShort();

//            exit
            if (choice == 9) {
                break;
            }

            switch (choice) {
                //           rectangle, parallelogram
                case 1, 2 -> {
                    System.out.println("Choose 1. Area\t2. Perimeter");
                    choice = input.nextShort();

                    switch (choice){
//                         rectangle area, parallelogram area
                       case 1 -> {
                           length = input.nextFloat();
                           height = input.nextFloat();
                           ans = length * height;
                       }
//                        rectangle perimeter, parallelogram perimeter (length, height  are sides)
                       case 2 -> {
                           length = input.nextFloat();
                           height = input.nextFloat();
                           ans = 2 * (length + height);
                       }
                    }

                }

//                    triangle area,  isosceles triangle area
                case 3, 4 -> {
                    length = input.nextFloat();
                    height = input.nextFloat();
                    ans = (length * height) / 2;
                }

//                rhombus area(diagonals: d1, d2) or perimeter, square perimeter
                case 5, 6 -> {
                    if (choice == 6){
                        float side = input.nextFloat();
                        ans = 4 * side;
                    }
                    else{
                        System.out.println("Choose 1. Area\t2. Perimeter");
                        choice = input.nextShort();
                        switch (choice){
                            case 1 -> {
                                length = input.nextFloat();
                                height = input.nextFloat();
                                ans = (length * height) / 2;
                            }
                            case 2 -> {
                                float side = input.nextFloat();
                                ans = 4 * side;
                            }
                        }
                    }

                }

//                    circle
                case 7 -> {
                    System.out.println("Choose 1. Area\t2. Perimeter");
                    choice = input.nextShort();
                    float radius = input.nextFloat();

                    switch (choice){
//                         circle area or perimeter
                        case 1 -> ans = Math.PI * radius * radius;
                        case 2 -> ans = 2 * Math.PI * radius;
                    }
                }

//                    equilateral triangle
                case 8 -> {
                    System.out.println("Choose 1. Area\t2. Perimeter");
                    choice = input.nextShort();
                    float side = input.nextFloat();

//                    equilateral triangle area or perimeter
                    switch (choice){
                        case 1 ->  ans = (Math.sqrt(3) / 4) * (side * side);
                        case 2 -> ans = 3 * side;
                    }

                }

                default -> {
                    System.out.println("invalid choice!");
                    continue;
                }

            }
            System.out.println(ans + "\n");
        }
    }



}
