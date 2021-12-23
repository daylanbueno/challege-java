package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Sum of all even numbers from 1 up to n
    >> Write down a program that will take an integer n as input and will print
    >> the addition of all even numbers up to n
    ## Test ##
    input: 5  output: 6     tips(2+4=6)
    input: 10 output: 30     tips(2+4+6+8+10=30)
*/
public class Challenge17SumUpEvenNumberToN {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("result "+ sumEvenNumberUpToN(number));
     }

    private static Integer sumEvenNumberUpToN(Integer number) {
         int sum = 0;
         for (int i = 1; i<= number; i ++) {
             if (i%2==0) {
                 sum = sum + i;
             }
         }
         return sum;
    }

}
