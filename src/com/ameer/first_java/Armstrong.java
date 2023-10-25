package com.ameer.first_java;

public class Armstrong {
    public static void main(String[] args) {

        /*To find Armstrong Number between two given number.
        start
        input:num1,num2

        Edge Cases{
        if num1>num2: enter num1,num2 again
        if num1 or num2 == -ve : enter num1,num2 again
        }

        else

        for loop until num1<=num2:
             find number of digits in number (dividing by 10)
            obtaining each digit from number (mod 10)
             each digit raised to the power (Math.pow())
             if sum == num:
              output: Armstrong num
             exit
            else:
                output: not Armstrong
                exit

         */

        int num1 = 151;
        int num2 = 160;
        //        boolean flag = false;

        for (int i = num1+1; i < num2; i++) {

            int tempNum = i;
            int count = 0;
            int sum = 0;

//      find  number of digits
            while (tempNum != 0) {
                count++;
                tempNum /= 10;
            }

//            System.out.println(count);
            tempNum = i;

//calculate  sum of individual digit raised to the power
            while (tempNum != 0) {
                int digit = tempNum % 10;
                sum += Math.pow(digit, count);
                tempNum /= 10;
            }

//check if num is armstrong or not
            if (sum == i) {
//                flag = true;
//                break;
                System.out.println(sum);
            }

        }

//        if (flag) {
//            System.out.println(i + " is an Armstrong number.");
//        } else {
//            System.out.println("NO  Armstrong number found!");
//        }
    }
}
