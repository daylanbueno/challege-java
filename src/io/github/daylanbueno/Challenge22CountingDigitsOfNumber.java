package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Count digits of a number
    >> Write down a program that will take an integer as input and will count the digits of the given number
    ## Test ##
    input: 123  output: 3
    input: 8570 output: 4
*/

public class Challenge22CountingDigitsOfNumber {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println(number.toString().length());
     }
}
