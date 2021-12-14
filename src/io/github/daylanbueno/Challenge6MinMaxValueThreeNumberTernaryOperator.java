package io.github.daylanbueno;

/*
    Problem: Min max of three (Ternary operator)
    Title: Find min, max of three numbers
    >> Write down a program that will find minimum and maximum of three
    >> numbers using ternary operator
    ## Test ##
    input: 1 2 3 output: min=1 max=3
    input: 5 2 8 output: min=2 max=8
*/
public class Challenge6MinMaxValueThreeNumberTernaryOperator {
     public static void main(String [] args) {
        int n1 = 5, n2 = 2, n3= 8 ;
        int min = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;
        int max = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
        System.out.println("Min= "+min+" Max= "+max);
    }
}
