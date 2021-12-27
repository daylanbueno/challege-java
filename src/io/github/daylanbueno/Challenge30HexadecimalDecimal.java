package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Hexadecimal to decimal
    >> Write down a program that will take a hexadecimal number as input and will print equivalent decimal number
    ## Test ##
    input: 375  output: 885
    input: 16   output: 22
*/
public class Challenge30HexadecimalDecimal {
     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("Decimal: "+Integer.parseInt(number.toString(), 16));
     }
}
