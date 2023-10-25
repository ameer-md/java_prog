package com.ameer.conditions_loops;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter 1 - 5 to choose corresponding shape:");
            System.out.println("1. Cone\t2. Cylinder\t3. Prism\t 4. Pyramid\t5. Sphere\t6. Exit");
            short choice = input.nextShort();

            if (choice == 6){
                break;
            }

            double ans = 0;

            switch(choice){
//            cone and cylinder
                case 1, 2 -> {
                    float height = input.nextFloat();
                    float radius = input.nextFloat();
                    switch (choice){
                        case 1 -> ans = Math.PI * radius * radius * (height / 3);
                        case 2 -> ans = Math.PI * radius * radius * height;
                    }
                }

//            prism and pyramid
                case 3, 4 -> {
                    float length = input.nextFloat();
                    float width = input.nextFloat();
                    float height = input.nextFloat();

                    switch (choice){
                        case 3 -> {
                            System.out.println("Calculate volume for  1. rectangular 2.triangular prism");
                            choice = input.nextShort();
                            switch (choice){
                                case 1 -> ans = length * width * height;
                                case 2 -> ans = (1.0 / 2) * length * height * width;
                            }
                        }
                        case 4 -> ans = (length * width * height) / 3;
                    }
                }

//            sphere
                case 5 -> {
                    float radius = input.nextFloat();
                    ans = (4.0 / 3) * Math.PI * radius * radius * radius;
                }

                default -> {
                    System.out.println("invalid input!");
                    continue;
                }


            }

            System.out.println(ans);

        }
        }

}
