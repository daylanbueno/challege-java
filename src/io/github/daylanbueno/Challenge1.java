package io.github.daylanbueno;

/*
    Title: Add, Sub, Mul, Div, Mod

    >> Write down a program that will take two integers as input and will print equivalent

    >> Addition, subtraction, multiplication, division and modulus

    ## Test Case ##

    input: 6 3 output: Sum: 9 Sub: 3 Mul: 18 Div: 2 Mod: 0

    input: 9 2 output: Sum: 11 Sub: 7 Mul: 18 Div: 4 Mod: 1

*/
public class Challenge1 {
    public static void main(String[] args) {
           execute(6,3);
           execute(9,2);
    }
    public static void execute(Integer x, Integer y) {
        System.out.println("Sum:"+ (x + y) + " Sub:"+ (x-y)+ " Mul:"+(x*y)+ " Div:" +(x/y) + " Mod:"+(x%y));
    }
}
