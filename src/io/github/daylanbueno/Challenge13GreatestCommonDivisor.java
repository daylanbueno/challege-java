package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: GCD (Greatest Common Divisor)
    >> Write down a program that will take two integers as input and will
    >> find the gcd of them
    ## Test ##
    input: 2 4   output: 2
    input: 12 18 output:  6
*/
public class Challenge13GreatestCommonDivisor {
     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter two integers");
         Integer numberOne = in.nextInt();
         Integer numberTwo = in.nextInt();
         System.out.println("Result = "+getGreatCommonDivisor(numberOne, numberTwo));
     }

     public static int getGreatCommonDivisor(int num1, int num2) {
         int greatNumber = 0;
         for (int i=1; i <=num1 && i<=num2; i++) {
             if(num1%i==0 && num2%i==0) {
                 greatNumber = i;
             }
         }
         return  greatNumber;
     }
}
