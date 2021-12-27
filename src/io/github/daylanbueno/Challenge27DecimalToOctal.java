package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Decimal to Octal
    >> Write down a program that will take a number as input and will print equivalent octal
    ## Test ##
    input: 175 output: 257
    input: 50 output: 62
*/
public class Challenge27DecimalToOctal {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("Octal: "+Integer.toOctalString(number));
     }
}
