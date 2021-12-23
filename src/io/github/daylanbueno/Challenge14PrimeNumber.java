package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Prime number testing
    >> Write down a program that will take a number as input and
    >> will check the given number is prime number or not
    ## Test ##
    input: 8  output: false
    input: 11 output: true
*/
public class Challenge14PrimeNumber {
     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a integer");
         Integer number = in.nextInt();
         System.out.println("is prime number ? "+findPrimeNumber(number));
     }

     private static Boolean findPrimeNumber(int number) {
         if (number == 1) { return false; }
         int countDivisor = 0;
         for (int i = number; i> 1; i--) {
            if(number%i == 0) {
                ++countDivisor;
            }
            if (countDivisor > 2) {
                return false;
            }
         }
         return true;
     }
}
