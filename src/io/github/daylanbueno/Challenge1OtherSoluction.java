package io.github.daylanbueno;

import java.util.Scanner;

/*
    Title: Add, Sub, Mul, Div, Mod

    >> Write down a program that will take two integers as input and will print equivalent

    >> Addition, subtraction, multiplication, division and modulus

    ## Test Case ##

    input: 6 3 output: Sum: 9 Sub: 3 Mul: 18 Div: 2 Mod: 0

    input: 9 2 output: Sum: 11 Sub: 7 Mul: 18 Div: 4 Mod: 1

*/
public class Challenge1OtherSoluction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter two intergers:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        int add = n1 + n2;
        int sub = n1 - n2;
        int mul = n1 * n2;
        int div = n1 / n2;
        int mod = n1 % n2;

        System.out.println("Add="+add+" Sub="+sub+ " Mul="+mul+ " Div="+div+" Mod="+mod);

    }

}
