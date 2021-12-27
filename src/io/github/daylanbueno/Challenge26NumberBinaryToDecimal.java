package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Binary to decimal
    >> Write down a program that will take a binary number as input and will print equivalent decimal number
    ## Test ##
    input: 111  output: 7
    input: 1001 output: 9
*/
public class Challenge26NumberBinaryToDecimal {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println(Integer.parseInt(number.toString(), 2));
     }
}
