package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Sum of digits
    >> Write down a program that will take an integer as input and will add digits of the given number
    ## Test ##
    input: 123  output: 6     tips(1+2+3=6)
    input: 8570 output: 20    tips(8+5+7+0=20)
*/
public class Challenge22CountingDigitsOfNumber {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         int sum = 0, lastDigit;
         while (number != 0) {
             lastDigit = number % 10;
             sum =  sum + lastDigit;
             number = number / 10;
         }
         System.out.println(sum);
     }
}
