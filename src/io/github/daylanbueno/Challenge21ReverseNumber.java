package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Reverse a number
    >> Write down a program that will take an integer as input and will print
    >> the number in reverse order
    input: 123 output: 321
    input: 846 output: 648
*/
public class Challenge21ReverseNumber {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         StringBuilder sb = new StringBuilder(number.toString());
         System.out.println(sb.reverse());
     }
}
