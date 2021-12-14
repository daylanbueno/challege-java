package io.github.daylanbueno;
import java.util.Scanner;

/*
   Title: Find area of a circle
    >> Write down a program that will take radius of a circle and calculate area of the circle
    ## Test Case ##
    input: 6.2 output: 120.763
    input: 7.5 output: 176.715
*/

public class Challenge3CalculateAreaCircle {
     public static void main(String [] args) {
         System.out.println("Please, enter radius of cicle");
         Scanner scanner = new  Scanner(System.in);
         float radius = scanner.nextFloat();
         double area = 3.1416 * radius * radius;
         System.out.printf("Are %.3f", area);
    }
}
