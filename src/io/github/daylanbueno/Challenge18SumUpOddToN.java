package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Sum of all odd numbers from 1 up to n
    >> Write down a program that will take an integer n as input and will print
    >> the addition of all odd numbers up to n
    ## Test ##
    input: 5  output: 9      tips(1+3+5=9)
    input: 10 output: 25     tips(1+3+5+7+9=25)
*/
public class Challenge18SumUpOddToN {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("result "+sumOddNumberUpToN(number));
     }

    private static Integer sumOddNumberUpToN(Integer number) {
         int sum = 0;
         for (int i = 1; i<= number; i ++) {
             if (i%2!=0) {
                 sum = sum + i;
             }
         }
         return sum;
    }

}
