package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Checking a string is a palindrome or not
    >> Write down a program that will check given string is a palindrome or not
    ## Test ##
    input: hello output: false
    input: awa   output: true
*/
public class Challenge25PalindromeString {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a name");
         String name = in.nextLine();
         StringBuilder sbName = new StringBuilder(name);
         System.out.println("Is polidrome "+sbName.reverse().toString().equals(name));
     }
}
