package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Perfect number testing
    >> Write down a program that will take an integer as input and
    >> will check the number is perfect number or not
    ## Test ##
    input: 10 output: false
    input: 6  output: true
    input: 28 output: true
*/
public class Challenge15PerfectNumber {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("is prime number ? "+isPerfectNumber(number));
     }

    private static Boolean isPerfectNumber(Integer number) {
         int sum = 0;
        for (int i= 1; i <=number/2; i++) {
            if (number%i==0) {
                sum = sum + i;
            }
        }
         return number == sum;
    }

}
