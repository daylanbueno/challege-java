package io.github.daylanbueno;

import java.util.Scanner;
/*
    Title: Fizzbuzz
    >> Write down a program that will take an integer as input and will print 1 to n
    >> but for multiples of three print 'fizz' instead of the number and for multiples
    >> of five print 'buzz'. Also for numbers which are multiples of both three and five print 'fizzbuzz'
    ## Test ##
    input: 5  output: 1 2 "fizz" 4 "buzz"
    input: 15 output: 1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz"
*/
public class Challenge20Fizzbuzz {

     public static void main(String [] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer");
         Integer number = in.nextInt();
         for(int i = 1; i<=number; i++) {
             if(i%3==0) {
                 System.out.println("fizz");
                 continue;
             }
             if(i%5==0) {
                 System.out.println("buzz");
                 continue;
             }
             if (i%3==0&& i%5==0) {
                 System.out.println("fizzbuzz");
                 continue;
             }
             System.out.println(i);
         }
     }
}
