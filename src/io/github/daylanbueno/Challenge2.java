package io.github.daylanbueno;
import java.util.Scanner;

/*
    Problem: Checking a number even or odd
    Title: Checking a number even or odd
    >> Write down a program that will take an integers as input and will check the given number is even or odd
    ## Test Case ##
    input: 6 output: even
    input: 7 output: odd
*/

public class Challenge2 {
     public static void main(String args[]) {
         System.out.println("Please, enter with number interge");
         int number = new Scanner(System.in).nextInt();

         if (number % 2 == 0) {
             System.out.println(number+ " is EVEN");
            return;
         }
         System.out.println(number+ " is ODD");
    }
}
