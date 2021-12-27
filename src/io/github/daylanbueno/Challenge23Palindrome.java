package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Checking a number is a palindrome or not
    >> Write down a program that will check a number is a palindrome or not
    ## Test ##
    input: 121 output: true
    input: 123 output: false
*/
public class Challenge23Palindrome {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         StringBuilder sb = new StringBuilder(number.toString());
         System.out.println("Is polidrome "+sb.reverse().toString().equals(number.toString()));
     }
}
