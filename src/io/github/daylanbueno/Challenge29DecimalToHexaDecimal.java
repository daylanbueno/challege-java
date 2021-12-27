package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Decimal to Hexadecimal
    >> Write down a program that will take a number as input and will print equivalent hexadecimal
    ## Test ##
    input: 80 output: 50
    input: 50 output: 32
*/
public class Challenge29DecimalToHexaDecimal {
     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("Hexadecimal: "+Integer.toHexString(number));
     }
}
