package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Decimal to Binary
    >> Write down a program that will take a decimal number as input and will print the binary equivalent
    ## Test ##
    input: 3 output: 11
    input: 5 output: 101
*/

public class Challenge26DecimalToBinary {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("Binary: "+Integer.toBinaryString(number));
     }
}
