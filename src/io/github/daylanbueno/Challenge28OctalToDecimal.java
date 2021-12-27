package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Octal to decimal
    >> Write down a program that will take a octal number as input and will print equivalent decimal number
    ## Test ##
    input: 50  output: 40
    input: 130 output: 88
*/
public class Challenge28OctalToDecimal {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("Decimal: "+Integer.parseInt(number.toString(), 8));
     }
}
