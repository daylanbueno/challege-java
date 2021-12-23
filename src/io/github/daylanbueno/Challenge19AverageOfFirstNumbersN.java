package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Average of first n numbers
    >> Write down a program that will take a number(n) as input and will print
    >> average of first n numbers
    ## Test ##
    input: 5  output: 3.0      [(1+2+3+4+5)/5=3]
    input: 10 output: 5.5      [(1+2+3+4+5+6+7+8+9+10)/10=5.5]
*/
public class Challenge19AverageOfFirstNumbersN {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println("Average: "+ averageFirstNumbers(number));
     }

    private static double averageFirstNumbers(Integer number) {
         double sum = 0;
         for (int i = 1; i<= number; i ++) {
             sum = sum + i;
         }
         return sum / number;
    }

}
