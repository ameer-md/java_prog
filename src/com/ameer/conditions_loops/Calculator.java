package com.ameer.conditions_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        float num1, num2, ans = 0;
        char operator;
        String equal;
        StringBuilder history = new StringBuilder();
        String choice = "running";

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter your expression (num operator num):");
            num1 = input.nextFloat();
            operator = input.next().charAt(0);
            num2 = input.nextFloat();
            equal = input.nextLine();

//            check the operator
            if (operator == '*' || operator == '/' || operator == '-' || operator == '+' || operator == '%'){

                // calculate num1 , num2
                if(operator == '+'){
                    ans = num1 + num2;
                }
                else if(operator == '-'){
                    ans = num1 - num2;
                }
                else if(operator == '*'){
                    ans = num1 * num2;
                }
                else if(operator == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                else if(operator == '%'){
                    ans = num1 % num2;
                }

                System.out.print(ans + " ");

//                updating history
                history.append(num1).append(" ").append(operator).append(" ").append(num2).append(" = ").append(ans).append("\n");


//       calculate using  previous ans
                while(equal.equals(" =")){
                    num1 = ans;
                    operator = input.next().charAt(0);
                    num2 = input.nextFloat();
                    equal = input.nextLine();

                    if(operator == '+'){
                        ans = num1 + num2;
                    }
                    else if(operator == '-'){
                        ans = num1 - num2;
                    }
                    else if(operator == '*'){
                        ans = num1 * num2;
                    }
                    else if(operator == '/'){
                        ans = num1 / num2;
                    }
                    else if(operator == '%'){
                        ans = num1 % num2;
                    }
                    System.out.print(ans+ " ");
                    history.append(num1).append(" ").append(operator).append(" ").append(num2).append(" = ").append(ans).append("\n");
                }

            }

//             operator  invalid go to next iteration
            else {
                System.out.println("Invalid operator!\n");
                continue;
            }


//        get user choice (show history or exit)
            System.out.println("\n\nEnter [h: history/ hx: history + exit/ x: exit]:");
            choice = input.next();


            if(choice.equals("h") || choice.equals("H")){
                System.out.println("\n" + history);
            }
            else if (choice.equals("hx")){
                System.out.println("\n" + history);
            }

//        combination of != and "&&", if any one expression false then exit
        }while((!choice.equals("x") && !choice.equals("X")) && (!choice.equals("hx")));

        System.out.println("Program Ended!");
    }
}
