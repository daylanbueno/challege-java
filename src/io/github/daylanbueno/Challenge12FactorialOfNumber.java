package io.github.daylanbueno;

import java.util.Arrays;
import java.util.List;

/*
    Problem: Factorial of a number
    Title: Factorial of a number
    >> Write down a program that will take an integer (number) as input and will
    >> find the factorial of the number
    ## Test ##
    input: 3 output: 6
    input: 4 output: 24
*/
public class Challenge12FactorialOfNumber {
     public static void main(String [] args) {
        int number = 4;
        int factorial = number;
        do {
            if(factorial == 1) break;
            number --;
            factorial = (factorial * number);
        } while (number > 1);

        System.out.println(factorial);
     }
}
