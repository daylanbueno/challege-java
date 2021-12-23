package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Sum from 1 up to n
    >> Write down a program that will take an integer(n) and will print sum from 1 up to n
    ## Test ##
    input: 4 output: 10   Tips:(1+2+3+4=10)
    input: 5 output: 15
*/
public class Challenge16SumUpToN {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("result "+sumUpNumber(number));
     }

    private static Integer sumUpNumber(Integer number) {
         int sum = 0;
         for (int i = 1; i<= number; i ++) {
             sum = sum + i;
         }
         return sum;
    }

}
