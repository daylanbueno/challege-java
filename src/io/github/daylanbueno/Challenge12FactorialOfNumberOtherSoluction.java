package io.github.daylanbueno;

import java.util.Scanner;

/*
    Problem: Factorial of a number
    Title: Factorial of a number
    >> Write down a program that will take an integer (number) as input and will
    >> find the factorial of the number
    ## Test ##
    input: 3 output: 6
    input: 4 output: 24
*/
public class Challenge12FactorialOfNumberOtherSoluction {
     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         System.out.println(factorial(number));
     }

//     public static int factorial (int num) {
//         using loop
//         int fact = 1;
//         for(int i = 1; i<=num; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }

     public static int factorial (int num) {
         //using recursion
         if(num == 1) return 1;
         return num * factorial(num-1);
     }


}
